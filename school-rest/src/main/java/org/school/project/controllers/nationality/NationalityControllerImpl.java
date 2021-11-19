package org.school.project.controllers.nationality;

import org.school.project.services.nationality.NationalityService;
import org.school.project.services.nationality.dto.NationalityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nationality")
public class NationalityControllerImpl implements NationalityController {

    private NationalityService service;

    @Autowired
    public NationalityControllerImpl(NationalityService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<NationalityDto>> selectNationalities() {
        List<NationalityDto> result = this.service.selectNationalities();
        return ResponseEntity.ok(result);
    }
}
