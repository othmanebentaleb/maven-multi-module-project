package org.school.project.services;

import org.school.project.entities.Classe;

public interface ClasseService {

    public Classe findByNiveau(String niveau);
    public Classe findByNomClasse(String nom);
}
