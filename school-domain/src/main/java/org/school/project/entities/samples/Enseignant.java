package org.school.project.entities.samples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnseignant;
    @NotEmpty(message = "Nom ne doit pas être vide")
    private String nom;
    @NotEmpty(message = "Prénom ne doit pas être vide")
    private String prenom;
    @OneToOne(cascade = {CascadeType.ALL}) @JoinColumn(name = "coordonnees")
    private Coordonnees coordonnees;
    private String matiere;
    @ManyToOne
    @JoinColumn(name = "idClasse")
    private Classe classe;


}
