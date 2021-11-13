package org.school.project.repositories.samples;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.school.project.entities.samples.Etudiant;

import java.util.List;
import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    @Query("SELECT etud FROM Etudiant etud WHERE etud.coordonnees.email = :email ")
    public Optional<Etudiant> findByEmail(@Param("email") String email);
    @Query("SELECT etud FROM Etudiant etud WHERE etud.coordonnees.telephone = :phone ")
    public Etudiant findByPhone(@Param("phone") String phone);
    public List<Etudiant> findByNomAndPrenom(String nom, String prenom);
}
