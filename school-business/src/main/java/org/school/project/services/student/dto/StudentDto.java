package org.school.project.services.student.dto;

import org.school.project.samples.dto.*;
import org.school.project.services.faculty.dto.FacultyDto;
import org.school.project.services.group.dto.GroupDto;
import org.school.project.services.level.dto.LevelDto;
import org.school.project.services.nationality.dto.NationalityDto;

import java.util.Date;

public class StudentDto {

    private Long id;

    private String cin;

    private String firstName;

    private String secondName;

    private Boolean gender;

    private Date birthDay;

    private NationalityDto nationality;

    private String birthLocation;

    private String email;

    private String imagePath;

    private String cne;

    private Date inscriptionDate;

    private String provenance;

    private FacultyDto faculty;

    private LevelDto level;

    private SchoolingDto schooling;

    private ParentInfoDto parentInfo;

    private GroupDto group;

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

    public NationalityDto getNationality() {
        return nationality;
    }

    public void setNationality(NationalityDto nationality) {
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

    public FacultyDto getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyDto faculty) {
        this.faculty = faculty;
    }

    public LevelDto getLevel() {
        return level;
    }

    public void setLevel(LevelDto level) {
        this.level = level;
    }

    public SchoolingDto getSchooling() {
        return schooling;
    }

    public void setSchooling(SchoolingDto schooling) {
        this.schooling = schooling;
    }

    public ParentInfoDto getParentInfo() {
        return parentInfo;
    }

    public void setParentInfo(ParentInfoDto parentInfo) {
        this.parentInfo = parentInfo;
    }

    public GroupDto getGroup() {
        return group;
    }

    public void setGroup(GroupDto group) {
        this.group = group;
    }
}
