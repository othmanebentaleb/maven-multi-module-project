package org.school.project.services.level.dto;

import org.school.project.samples.dto.YearDto;

public class LevelDto {
    private Long id;

    private String level;

    private YearDto year;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public YearDto getYear() {
        return year;
    }

    public void setYear(YearDto year) {
        this.year = year;
    }
}
