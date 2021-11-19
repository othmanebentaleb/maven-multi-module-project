package org.school.project.services.faculty;

import org.school.project.services.faculty.dto.FacultyDto;

import java.util.List;

public interface FacultyService {

    public List<FacultyDto> selectFaculties();
}
