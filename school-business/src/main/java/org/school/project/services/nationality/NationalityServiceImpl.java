package org.school.project.services.nationality;

import org.school.project.entities.Nationality;
import org.school.project.repositories.NationalityRepository;
import org.school.project.services.nationality.dto.NationalityDto;
import org.school.project.services.nationality.mapper.NationalityAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalityServiceImpl implements NationalityService {

    private NationalityRepository repository;

    private NationalityAssembler assembler;

    @Autowired
    public NationalityServiceImpl(NationalityRepository repository, NationalityAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @Override
    public List<NationalityDto> selectNationalities() {
        List<Nationality> result = this.repository.findAll();
        return this.assembler.toDtoList(result);
    }
}