package org.school.project.repositories.samples;

import org.springframework.data.jpa.repository.JpaRepository;
import org.school.project.entities.samples.FicheAbsence;

public interface FicheAbsenceRepository extends JpaRepository<FicheAbsence, Long> {
}
