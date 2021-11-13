package org.school.project.controllers.faculty;

import org.school.project.services.absence.dto.AbsenceDto;
import org.school.project.services.faculty.FacultyBusiness;
import org.school.project.services.faculty.dto.FacultyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/faculty")
public class FacultyControllerImpl implements FacultyController {

    @Autowired
    private FacultyBusiness business;

    @GetMapping
    public ResponseEntity<List<FacultyDto>> selectFaculties() {
        List<FacultyDto> result = this.business.selectFaculties();
        return ResponseEntity.ok(result);
    }
}
