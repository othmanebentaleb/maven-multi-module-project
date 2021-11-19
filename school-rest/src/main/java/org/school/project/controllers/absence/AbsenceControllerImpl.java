package org.school.project.controllers.absence;

import org.school.project.services.absence.AbsenceService;
import org.school.project.services.absence.dto.AbsenceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/absence")
public class AbsenceControllerImpl implements AbsenceController {

    private AbsenceService service;

    @Autowired
    public AbsenceControllerImpl(AbsenceService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<AbsenceDto>> selectAbsences() {
        List<AbsenceDto> result = this.service.selectAbsences();
        return ResponseEntity.ok(result);
    }
}
