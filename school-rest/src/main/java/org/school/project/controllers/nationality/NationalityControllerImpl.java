package org.school.project.controllers.nationality;

import org.school.project.services.nationality.NationalityBusiness;
import org.school.project.services.nationality.dto.NationalityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nationality")
public class NationalityControllerImpl implements NationalityController {

    @Autowired
    private NationalityBusiness business;

    @GetMapping
    public ResponseEntity<List<NationalityDto>> selectNationalities() {
        List<NationalityDto> result = this.business.selectNationalities();
        return ResponseEntity.ok(result);
    }
}
