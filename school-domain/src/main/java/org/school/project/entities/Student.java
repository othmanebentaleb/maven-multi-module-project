package org.school.project.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;
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
    @Accessors(chain = true)
    private String cin;

    @Column(name = "prenom")
    @Accessors(chain = true)
    private String firstName;

    @Column(name = "nom")
    @Accessors(chain = true)
    private String secondName;

    @Column(name = "sexe")
    @Accessors(chain = true)
    private Boolean gender;

    @Column(name = "dateNaissance")
    @Accessors(chain = true)
    private Date birthDay;

    /*@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name="idNationalite")
    @Accessors(chain = true)
    private Nationality nationality;*/

    @Column(name = "lieuNaissance")
    @Accessors(chain = true)
    private String birthLocation;

    @Accessors(chain = true)
    private String email;

    @Column(name = "imagePath")
    @Accessors(chain = true)
    private String imagePath;

    @Accessors(chain = true)
    private String cne;

    @Column(name = "dateInscription")
    @Accessors(chain = true)
    private Date inscriptionDate;

    @Column(name = "provenance")
    @Accessors(chain = true)
    private String provenance;

    /*@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "idFiliere")
    @Accessors(chain = true)
    private Faculty faculty;*/

    /*@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "idNiveau")
    @Accessors(chain = true)
    private Level level;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "idScolarite")
    @Accessors(chain = true)
    private Schooling schooling;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "idParentInfo")
    @Accessors(chain = true)
    private ParentInfo parentInfo;
*/
  /*  @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idGroupe")
    @Accessors(chain = true)
    private Group group;*/

    @Column(name = "telephone")
    @Accessors(chain = true)
    private String phone;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    @Accessors(chain = true)
    private List<Document> documents;

}
