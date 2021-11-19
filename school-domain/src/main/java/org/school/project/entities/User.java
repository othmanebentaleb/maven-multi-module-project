package org.school.project.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Table(name="utilisateur")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Long id;

    private String username;

    private String password;

    @Column(name = "prenom")
    private String firstName;

    @Column(name = "nom")
    private String secondName;

    @Column(name = "responsableAbsence", columnDefinition="TINYINT DEFAULT false")
    private boolean canManageAbsences;

    @Column(name = "canManageAttestationReussite", columnDefinition="TINYINT DEFAULT false")
    private boolean canManageAttestationReussite;

    @Column(name = "canManageAttestationScolarite", columnDefinition="TINYINT DEFAULT false")
    private boolean canManageAttestationScolarite;

    private Boolean blockedAccount;

    @Column(name = "status", columnDefinition="TINYINT DEFAULT false")
    private boolean status;
}
