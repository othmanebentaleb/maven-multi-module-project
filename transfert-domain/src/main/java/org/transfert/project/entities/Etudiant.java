package org.transfert.project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

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
    private String nom;
    @NotEmpty(message = "Prénom ne doit pas être vide")
    private String prenom;
    private String telephone;
    private String email;
    @ManyToOne
    @JoinColumn(name = "idClasse")
    private Classe classe;
}
