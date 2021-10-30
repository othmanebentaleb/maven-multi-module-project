package org.school.project.services.impl;

import org.school.project.services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.school.project.entities.Classe;
import org.school.project.repositories.ClasseRepository;

public class ClasseServiceImpl implements ClasseService {

    private ClasseRepository classeRepository;

    @Autowired
    public ClasseServiceImpl(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    @Override
    public Classe findByNiveau(String niveau) {
        return this.classeRepository.findByNiveau(niveau);
    }

    @Override
    public Classe findByNomClasse(String nom) {
        return this.classeRepository.findByNom(nom);
    }
}
