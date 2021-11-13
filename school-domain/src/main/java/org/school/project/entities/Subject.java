package org.school.project.entities;

import javax.persistence.*;

@Table(name="matiere")
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String name;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "id_Filiere", unique=false, nullable=true, insertable=true, updatable=true)
    private Faculty faculty;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "id_Niveau", unique=false, nullable=true, insertable=true, updatable=true)
    private Level level;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
