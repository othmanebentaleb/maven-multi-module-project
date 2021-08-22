package org.transfert.project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.transfert.project.entities.Classe;
import org.transfert.project.repositories.ClasseRepository;
import org.transfert.project.services.ClasseService;

public class ClasseServiceImpl implements ClasseService {

    private ClasseRepository classeRepository;

    @Autowired
    public ClasseServiceImpl(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    @Override
    public Classe findByNiveau(String niveau) {
        return null;
    }

    @Override
    public Classe findByNomClasse(String nom) {
        return null;
    }
}
