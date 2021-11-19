package org.school.project.entities.samples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    @NotEmpty(message = "Nom ne doit pas être vide")
    @Size(min = 2, message = "Le nom doit être d'un minimum de 2")
    private String nom;
    @NotEmpty(message = "Prénom ne doit pas être vide")
    @Size(min = 2, message = "Le prénom doit être d'un minimum de 2")
    private String prenom;
    @Past
    private Date dateNaissance;
    @OneToOne(cascade = {CascadeType.ALL}) @JoinColumn(name = "coordonnees")
    private Coordonnees coordonnees;
    /*@OneToOne(cascade = {CascadeType.ALL}) @JoinColumn(name = "absences")
    private FicheAbsence absence;
    @ManyToOne
    @JoinColumn(name = "idClasse")
    private Classe classe;*/
}
