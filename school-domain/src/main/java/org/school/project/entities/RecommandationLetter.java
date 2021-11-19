package org.school.project.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name="lettrerecommandation")
@Entity
@Data
public class RecommandationLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE,  optional = false)
    @JoinColumn(name = "id_Etudiant")
    private Student student;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE,  optional = false)
    @JoinColumn(name = "id_Annee")
    private Year year;

    private Date date;

    private Integer internDuration;

    @Column(name = "nomEntreprise")
    private String entrepriseName;

    private String assurence;

    @Column(name = "filename")
    private String filename;
}
