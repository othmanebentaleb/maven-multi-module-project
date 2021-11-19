package org.school.project.samples.services;

import org.school.project.entities.samples.Etudiant;

import java.util.List;
import java.util.Optional;

public interface EtudiantService {

    public Etudiant ajouterEtudiant(Etudiant etudiant);
    public Optional<Etudiant> findByEmail(String email);
    public List<Etudiant> getAllEtudiants();
}
