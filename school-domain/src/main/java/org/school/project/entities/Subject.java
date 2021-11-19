package org.school.project.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Table(name="matiere")
@Entity
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "nom")
    private String name;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "id_Filiere")
    private Faculty faculty;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "id_Niveau")
    private Level level;
}
