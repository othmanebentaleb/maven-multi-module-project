package org.transfert.project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnseignant;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String matiere;
    @ManyToOne
    @JoinColumn(name = "idClasse")
    private Classe classe;


}
