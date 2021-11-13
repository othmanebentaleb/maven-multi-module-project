package org.school.project.services.level;

import org.school.project.services.level.dto.LevelDto;

import java.util.List;

public interface LevelBusiness {

    public List<LevelDto> selectLevels();
}
