package org.school.project.samples.services;

import org.school.project.entities.samples.Classe;

public interface ClasseService {

    public Classe findByNiveau(String niveau);
    public Classe findByNomClasse(String nom);
}
