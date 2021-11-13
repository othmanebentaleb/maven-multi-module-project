package org.school.project.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name="etudiant")
@Entity
public class Student {

    @Id
    @Column(name = "idEtudiant")
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
    @JoinColumn(name="idNationalite", unique=false, nullable=true, insertable=true, updatable=true)
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
    @JoinColumn(name = "idFiliere", unique=false, nullable=true, insertable=true, updatable=true)
    private Faculty faculty;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "idNiveau", unique=false, nullable=true, insertable=true, updatable=true)
    private Level level;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL,  optional = false)
    @JoinColumn(name = "idScolarite", unique=false, nullable=true, insertable=true, updatable=true)
    private Schooling schooling;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "idParentInfo", unique=false, nullable=true, insertable=true, updatable=true)
    private ParentInfo parentInfo;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idGroupe", unique=false, nullable=true, insertable=true, updatable=true)
    private Group group;

    @Column(name = "telephone")
    private String phone;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Document> documents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
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

    public Schooling getSchooling() {
        return schooling;
    }

    public void setSchooling(Schooling schooling) {
        this.schooling = schooling;
    }

    public ParentInfo getParentInfo() {
        return parentInfo;
    }

    public void setParentInfo(ParentInfo parentInfo) {
        this.parentInfo = parentInfo;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
