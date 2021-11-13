package org.school.project.services.level.mapper;

import org.school.project.entities.Level;
import org.school.project.services.level.dto.LevelDto;
import org.school.project.utils.Assembler;
import org.springframework.stereotype.Component;

@Component
public class LevelAssembler extends Assembler<LevelDto, Level> {
    @Override
    public LevelDto toDto(Level model) {
        return null;
    }

    @Override
    public Level fromDto(LevelDto dto) {
        return null;
    }
}
