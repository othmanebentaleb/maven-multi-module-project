package org.transfert.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.transfert.project.entities.Classe;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

   public Classe findByNiveau(String niveau);
   public Classe findByNomClasse(String nom);
}
