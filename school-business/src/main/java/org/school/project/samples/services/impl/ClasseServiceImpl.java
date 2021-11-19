package org.school.project.samples.services.impl;

import org.school.project.samples.services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.school.project.entities.samples.Classe;
import org.school.project.repositories.samples.ClasseRepository;

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
