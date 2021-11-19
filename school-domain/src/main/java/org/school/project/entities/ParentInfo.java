package org.school.project.entities;

import javax.persistence.*;

@Table(name="parentinfo")
@Entity
public class ParentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "adresse")
    private String adress;

    @Column(name = "professionPere")
    private String fatherProfession;

    @Column(name = "professionMere")
    private String motherProfession;

    @Column(name = "emailPere")
    private String fatherEmail;

    @Column(name = "telephonePere")
    private String fatherPhone;

    @Column(name = "telephoneMere")
    private String motherPhone;

    @Column(name = "telephoneDomicile")
    private String residencePhone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFatherProfession() {
        return fatherProfession;
    }

    public void setFatherProfession(String fatherProfession) {
        this.fatherProfession = fatherProfession;
    }

    public String getMotherProfession() {
        return motherProfession;
    }

    public void setMotherProfession(String motherProfession) {
        this.motherProfession = motherProfession;
    }

    public String getFatherEmail() {
        return fatherEmail;
    }

    public void setFatherEmail(String fatherEmail) {
        this.fatherEmail = fatherEmail;
    }

    public String getFatherPhone() {
        return fatherPhone;
    }

    public void setFatherPhone(String fatherPhone) {
        this.fatherPhone = fatherPhone;
    }

    public String getMotherPhone() {
        return motherPhone;
    }

    public void setMotherPhone(String motherPhone) {
        this.motherPhone = motherPhone;
    }

    public String getResidencePhone() {
        return residencePhone;
    }

    public void setResidencePhone(String residencePhone) {
        this.residencePhone = residencePhone;
    }
}
