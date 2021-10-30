package org.school.project.services;

import org.school.project.entities.Etudiant;

import java.util.List;

public interface EtudiantService {

    public Etudiant ajouterEtudiant(Etudiant etudiant);
    public Etudiant findByEmail(String email);
    public List<Etudiant> getAllEtudiants();
}
