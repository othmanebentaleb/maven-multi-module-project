package org.school.project.entities;

import javax.persistence.*;

@Table(name="Document")
@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDocument")
    private Long id;

    @Column(name = "nom")
    private String name;

    @Column(name = "imagePath")
    private String path;

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
