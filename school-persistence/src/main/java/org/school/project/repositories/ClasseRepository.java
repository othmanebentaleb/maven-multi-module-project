package org.school.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.school.project.entities.Classe;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

   public Classe findByNiveau(String niveau);
   public Classe findByNom(String nom);
}
