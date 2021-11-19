package org.school.project.services.level;

import org.school.project.services.level.dto.LevelDto;

import java.util.List;

public interface LevelService {

    public List<LevelDto> selectLevels();
}
