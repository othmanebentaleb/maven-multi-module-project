package org.transfert.project.services;

import org.transfert.project.entities.Etudiant;

import java.util.List;

public interface EtudiantService {

    public Etudiant ajouterEtudiant(Etudiant etudiant);
    public List<Etudiant> getAllEtudiants();
}
