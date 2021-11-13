package org.school.project.controllers.nationality;

import org.school.project.services.nationality.dto.NationalityDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NationalityController {
    public ResponseEntity<List<NationalityDto>> selectNationalities();
}
