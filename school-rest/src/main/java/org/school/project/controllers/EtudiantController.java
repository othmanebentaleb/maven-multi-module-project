package org.school.project.controllers;

import org.school.project.entities.Etudiant;
import org.school.project.exception.EtudiantExistsException;
import org.school.project.exception.EtudiantNotFoundException;
import org.school.project.repositories.ClasseRepository;
import org.school.project.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class EtudiantController {

    private EtudiantService etudiantService;
    private ClasseRepository classeRepository;
    private MessageSource messageSource;

    @Autowired
    public EtudiantController(EtudiantService etudiantService, ClasseRepository classeRepository, MessageSource messageSource) {
        this.etudiantService = etudiantService;
        this.classeRepository = classeRepository;
        this.messageSource = messageSource;
    }

    @PostMapping("/etudiants")
    public ResponseEntity<Etudiant> creerEtudiant(@RequestBody Etudiant etudiant) {
        Optional<Etudiant> etudiantExists = etudiantService.findByEmail(etudiant.getCoordonnees().getEmail());
        if(etudiantExists.isPresent()) throw new EtudiantExistsException(messageSource.getMessage("email.exists.error",null, LocaleContextHolder.getLocale()));
        Etudiant etudiantCreer = etudiantService.ajouterEtudiant(etudiant);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(etudiantCreer.getIdEtudiant()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/etudiants")
    public List<Etudiant> getAllEtudiants() {
        classeRepository.findAll();
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/etudiants/{email}")
    public EntityModel<Etudiant> findByEmail(@PathVariable String email) {
        Optional<Etudiant> etudiant = etudiantService.findByEmail(email);
        if (!etudiant.isPresent()) throw new EtudiantNotFoundException(messageSource.getMessage("etudiant.not.found",null,LocaleContextHolder.getLocale()));
        EntityModel<Etudiant> entityModel = EntityModel.of(etudiant.get());
        WebMvcLinkBuilder linkToAllStudents = linkTo(methodOn(this.getClass()).getAllEtudiants());
        entityModel.add(linkToAllStudents.withRel("all-students"));
        return entityModel;
    }
}
