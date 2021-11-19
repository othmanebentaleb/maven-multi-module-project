package org.school.project.repositories;

import org.school.project.entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsenceRepository  extends JpaRepository<Absence, Long> {
}
