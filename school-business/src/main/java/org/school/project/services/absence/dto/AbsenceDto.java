package org.school.project.services.absence.dto;

import org.school.project.entities.Subject;
import org.school.project.samples.dto.YearDto;
import org.school.project.services.student.dto.StudentDto;

import java.util.Date;

public class AbsenceDto {

    private Long id;

    private StudentDto student;

    private Subject subject;

    private YearDto year;

    private String day;

    private Date date;

    private String session;

    private Boolean motif;

    private Boolean call;

    private Boolean control;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public YearDto getYear() {
        return year;
    }

    public void setYear(YearDto year) {
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
