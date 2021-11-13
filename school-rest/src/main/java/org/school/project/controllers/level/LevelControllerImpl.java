package org.school.project.controllers.level;

import org.school.project.services.level.LevelBusiness;
import org.school.project.services.level.dto.LevelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/level")
public class LevelControllerImpl implements LevelController {

    @Autowired
    private LevelBusiness business;

    @GetMapping
    public ResponseEntity<List<LevelDto>> selectLevels() {
        List<LevelDto> result = this.business.selectLevels();
        return ResponseEntity.ok(result);
    }
}
