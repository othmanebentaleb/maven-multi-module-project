package org.school.project.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name="etudiant")
@Entity
@Data
public class Student {

    @Id
    @Column(name = "idEtudiant")
    @Setter(AccessLevel.NONE)
    private Long id;

    private String cin;

    @Column(name = "prenom")
    private String firstName;

    @Column(name = "nom")
    private String secondName;

    @Column(name = "sexe")
    private Boolean gender;

    @Column(name = "dateNaissance")
    private Date birthDay;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name="idNationalite")
    private Nationality nationality;

    @Column(name = "lieuNaissance")
    private String birthLocation;

    private String email;

    @Column(name = "imagePath")
    private String imagePath;

    private String cne;

    @Column(name = "dateInscription")
    private Date inscriptionDate;

    @Column(name = "provenance")
    private String provenance;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "idFiliere")
    private Faculty faculty;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "idNiveau")
    private Level level;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "idScolarite")
    private Schooling schooling;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "idParentInfo")
    private ParentInfo parentInfo;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idGroupe")
    private Group group;

    @Column(name = "telephone")
    private String phone;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Document> documents;

}
