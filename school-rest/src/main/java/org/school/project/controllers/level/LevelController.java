package org.school.project.controllers.level;

import org.school.project.services.level.dto.LevelDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LevelController {

    public ResponseEntity<List<LevelDto>> selectLevels();
}
