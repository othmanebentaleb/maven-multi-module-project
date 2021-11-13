package org.school.project.services.absence;

import org.school.project.entities.Absence;
import org.school.project.repositories.AbsenceRepository;
import org.school.project.services.absence.dto.AbsenceDto;
import org.school.project.services.absence.mapper.AbsenceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceBusinessImpl implements AbsenceBusiness {

    @Autowired
    private AbsenceRepository repository;

    @Autowired
    private AbsenceAssembler assembler;

    @Override
    public List<AbsenceDto> selectAbsences() {
        List<Absence> result = this.repository.findAll();
        return this.assembler.toDtoList(result);
    }
}
