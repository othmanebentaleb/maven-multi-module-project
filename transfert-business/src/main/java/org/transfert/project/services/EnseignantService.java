package org.transfert.project.services;

import org.transfert.project.entities.Enseignant;

import java.util.List;

public interface EnseignantService {

    public Enseignant ajouterEnseignant(Enseignant enseignant);
    public Enseignant findByNom(String nom);
    public List<Enseignant> findByMatiere(String matiere);
    public Enseignant findByEmail(String email);
    public Enseignant findByTelephone(String telephone);
    public void deleteEnseignant(Enseignant enseignant);

}
