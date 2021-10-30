package org.school.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.school.project.entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    @Query("SELECT etud FROM Etudiant etud WHERE etud.coordonnees.email = :email ")
    public Etudiant findByEmail(@Param("email") String email);
    @Query("SELECT etud FROM Etudiant etud WHERE etud.coordonnees.telephone = :phone ")
    public Etudiant findByPhone(@Param("phone") String phone);
    public List<Etudiant> findByNomAndPrenom(String nom, String prenom);
}
