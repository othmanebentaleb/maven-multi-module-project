package org.transfert.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.transfert.project.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
