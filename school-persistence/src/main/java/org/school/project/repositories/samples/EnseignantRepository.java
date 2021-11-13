package org.school.project.repositories.samples;

import org.springframework.data.jpa.repository.JpaRepository;
import org.school.project.entities.samples.Enseignant;

import java.util.List;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
    public List<Enseignant> findByMatiere(String matiere);
}
