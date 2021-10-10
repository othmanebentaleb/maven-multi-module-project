package org.transfert.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.transfert.project.entities.Etudiant;
import org.transfert.project.repositories.ClasseRepository;
import org.transfert.project.services.EtudiantService;

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
    public Etudiant creerEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.ajouterEtudiant(etudiant);
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
