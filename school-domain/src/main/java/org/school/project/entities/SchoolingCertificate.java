package org.school.project.entities;

import javax.persistence.*;
import java.util.Date;

@Table(name="SchoolingCertificate")
@Entity
public class SchoolingCertificate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE,  optional = false)
    @JoinColumn(name = "id_Et", unique=false, nullable=true, insertable=true, updatable=true)
    private Student student;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE,  optional = false)
    @JoinColumn(name = "id_An", unique=false, nullable=true, insertable=true, updatable=true)
    private Year year;

    private Date date;

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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
