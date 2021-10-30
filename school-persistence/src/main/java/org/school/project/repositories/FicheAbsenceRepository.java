package org.school.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.school.project.entities.FicheAbsence;

public interface FicheAbsenceRepository extends JpaRepository<FicheAbsence, Long> {
}
