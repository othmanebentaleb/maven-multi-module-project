package org.transfert.project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

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
    @NotEmpty(message = "Numéro de téléphone ne doit pas être vide")
    @Pattern(regexp="^(?:(?:\\+|00)33[\\s.-]{0,3}(?:\\(0\\)[\\s.-]{0,3})?|0)[1-9](?:(?:[\\s.-]?\\d{2}){4}|\\d{2}(?:[\\s.-]?\\d{3}){2})$",message = "Numéro de téléphone invalide")
    private String telephone;
    @NotEmpty(message = "Addresse mail ne doit pas être vide")
    @Email(message = "Veuillez saisir une adresse mail valide")
    private String email;
    @ManyToOne
    @JoinColumn(name = "idClasse")
    private Classe classe;
}
