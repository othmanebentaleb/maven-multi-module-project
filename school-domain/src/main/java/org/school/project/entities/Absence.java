package org.school.project.entities;

import javax.persistence.*;
import java.util.Date;

@Table(name="absence")
@Entity
public class Absence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE,  optional = false)
    @JoinColumn(name = "id_Etudiant", unique=false, nullable=true, insertable=true, updatable=true)
    private Student student;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE,  optional = false)
    @JoinColumn(name = "id_Matiere", unique=false, nullable=true, insertable=true, updatable=true)
    private Subject subject;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE,  optional = false)
    @JoinColumn(name = "id_Annee", unique=false, nullable=true, insertable=true, updatable=true)
    private Year year;

    @Column(name = "nomJour")
    private String day;

    @Column(name = "dateAbsence")
    private Date date;

    @Column(name = "seance")
    private String session;

    private Boolean motif;

    @Column(name = "appel")
    private Boolean call;

    @Column(name = "controle")
    private Boolean control;

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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Boolean getMotif() {
        return motif;
    }

    public void setMotif(Boolean motif) {
        this.motif = motif;
    }

    public Boolean getCall() {
        return call;
    }

    public void setCall(Boolean call) {
        this.call = call;
    }

    public Boolean getControl() {
        return control;
    }

    public void setControl(Boolean control) {
        this.control = control;
    }
}
