package org.school.project.services.level;

import org.school.project.entities.Level;
import org.school.project.repositories.LevelRepository;
import org.school.project.services.level.dto.LevelDto;
import org.school.project.services.level.mapper.LevelAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelBusinessImpl implements LevelBusiness{

    @Autowired
    private LevelRepository repository;

    @Autowired
    private LevelAssembler assembler;

    @Override
    public List<LevelDto> selectLevels() {
        List<Level> result = this.repository.findAll();
        return this.assembler.toDtoList(result);
    }
}
