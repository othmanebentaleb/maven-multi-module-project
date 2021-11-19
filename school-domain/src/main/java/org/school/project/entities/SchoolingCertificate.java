package org.school.project.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Table(name="SchoolingCertificate")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolingCertificate {

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

    private String filename;
}
