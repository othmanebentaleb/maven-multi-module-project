package org.school.project.controllers.absence;

import org.school.project.services.absence.AbsenceBusiness;
import org.school.project.services.absence.dto.AbsenceDto;
import org.school.project.services.student.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/absence")
public class AbsenceControllerImpl implements AbsenceController {

    @Autowired
    private AbsenceBusiness business;

    @GetMapping
    public ResponseEntity<List<AbsenceDto>> selectAbsences() {
        List<AbsenceDto> result = this.business.selectAbsences();
        return ResponseEntity.ok(result);
    }
}
