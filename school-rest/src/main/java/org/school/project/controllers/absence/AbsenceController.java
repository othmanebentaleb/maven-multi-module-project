package org.school.project.controllers.absence;

import org.school.project.services.absence.dto.AbsenceDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AbsenceController {

    public ResponseEntity<List<AbsenceDto>> selectAbsences();
}
