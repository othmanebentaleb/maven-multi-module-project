package org.school.project.controllers.faculty;

import org.school.project.services.faculty.dto.FacultyDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FacultyController {

    public ResponseEntity<List<FacultyDto>> selectFaculties();
}
