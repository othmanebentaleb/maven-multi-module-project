package org.school.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.school.project.entities.Etudiant;
import org.school.project.repositories.ClasseRepository;
import org.school.project.services.EtudiantService;

import java.net.URI;
import java.util.List;

@RestController
public class EtudiantController {

    private EtudiantService etudiantService;
    private ClasseRepository classeRepository;

    @Autowired
    public EtudiantController(EtudiantService etudiantService, ClasseRepository classeRepository) {
        this.etudiantService = etudiantService;
        this.classeRepository = classeRepository;
    }

    @PostMapping("/etudiant/save")
    public ResponseEntity<Etudiant> creerEtudiant(@RequestBody Etudiant etudiant){
        Etudiant etudiantCreer = etudiantService.ajouterEtudiant(etudiant);
        URI location =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(etudiantCreer.getIdEtudiant()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/etudiants")
    public List<Etudiant> getAllEtudiants(){
        classeRepository.findAll();
        return etudiantService.getAllEtudiants();
    }
    @GetMapping("/etudiant")
    public Etudiant findByEmail(@RequestParam String email){
        return etudiantService.findByEmail(email);
    }
}
