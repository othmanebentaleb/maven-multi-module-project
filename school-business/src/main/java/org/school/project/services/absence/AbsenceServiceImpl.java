package org.school.project.services.absence;

import org.school.project.entities.Absence;
import org.school.project.repositories.AbsenceRepository;
import org.school.project.services.absence.dto.AbsenceDto;
import org.school.project.services.absence.mapper.AbsenceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceServiceImpl implements AbsenceService {

    private AbsenceRepository repository;

    private AbsenceAssembler assembler;

    @Autowired
    public AbsenceServiceImpl(AbsenceRepository repository, AbsenceAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @Override
    public List<AbsenceDto> selectAbsences() {
        List<Absence> result = this.repository.findAll();
        return this.assembler.toDtoList(result);
    }
}
