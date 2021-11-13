package org.school.project.entities;

import javax.persistence.*;
import java.util.Date;

@Table(name="lettrerecommandation")
@Entity
public class RecommandationLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE,  optional = false)
    @JoinColumn(name = "id_Etu", unique=false, nullable=true, insertable=true, updatable=true)
    private Student student;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE,  optional = false)
    @JoinColumn(name = "id_Ann", unique=false, nullable=true, insertable=true, updatable=true)
    private Year year;

    private Date date;

    private Integer internDuration;

    @Column(name = "nomEntreprise")
    private String entrepriseName;

    private String assurence;

    @Column(name = "filename")
    private String filename;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getInternDuration() {
        return internDuration;
    }

    public void setInternDuration(Integer internDuration) {
        this.internDuration = internDuration;
    }

    public String getEntrepriseName() {
        return entrepriseName;
    }

    public void setEntrepriseName(String entrepriseName) {
        this.entrepriseName = entrepriseName;
    }

    public String getAssurence() {
        return assurence;
    }

    public void setAssurence(String assurence) {
        this.assurence = assurence;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
