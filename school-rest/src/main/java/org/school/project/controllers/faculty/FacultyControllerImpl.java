package org.school.project.controllers.faculty;

import org.school.project.services.faculty.FacultyService;
import org.school.project.services.faculty.dto.FacultyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyControllerImpl implements FacultyController {

    private FacultyService service;

    @Autowired
    public FacultyControllerImpl(FacultyService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FacultyDto>> selectFaculties() {
        List<FacultyDto> result = this.service.selectFaculties();
        return ResponseEntity.ok(result);
    }
}
