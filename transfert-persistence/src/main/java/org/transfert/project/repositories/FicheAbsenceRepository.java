package org.transfert.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.transfert.project.entities.FicheAbsence;

public interface FicheAbsenceRepository extends JpaRepository<FicheAbsence, Long> {
}
