package org.transfert.project.services;

import org.transfert.project.entities.Classe;

public interface ClasseService {

    public Classe findByNiveau(String niveau);
    public Classe findByNomClasse(String nom);
}
