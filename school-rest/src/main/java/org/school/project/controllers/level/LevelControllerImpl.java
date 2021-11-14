package org.school.project.controllers.level;

import org.school.project.services.level.LevelService;
import org.school.project.services.level.dto.LevelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/level")
public class LevelControllerImpl implements LevelController {

    private LevelService service;

    @Autowired
    public LevelControllerImpl(LevelService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<LevelDto>> selectLevels() {
        List<LevelDto> result = this.service.selectLevels();
        return ResponseEntity.ok(result);
    }
}
