package org.transfert.project.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.transfert.project.entities.Etudiant;
import org.transfert.project.repositories.EtudiantRepository;
import org.transfert.project.services.EtudiantService;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantService {

    private EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant findByEmail(String email) {
        return etudiantRepository.findByEmail(email);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
