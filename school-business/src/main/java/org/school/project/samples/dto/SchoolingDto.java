package org.school.project.samples.dto;

public class SchoolingDto {
    private Long id;

    private String bacNumber;

    private String serie;

    private String mention;

    private Integer year;

    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBacNumber() {
        return bacNumber;
    }

    public void setBacNumber(String bacNumber) {
        this.bacNumber = bacNumber;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
