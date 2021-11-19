package org.school.project.services.faculty;

import org.school.project.entities.Faculty;
import org.school.project.repositories.FacultyRepository;
import org.school.project.services.faculty.dto.FacultyDto;
import org.school.project.services.faculty.mapper.FacultyAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    private FacultyRepository repository;

    private FacultyAssembler assembler;

    @Autowired
    public FacultyServiceImpl(FacultyRepository repository, FacultyAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @Override
    public List<FacultyDto> selectFaculties() {
        List<Faculty> faculties = this.repository.findAll();
        return this.assembler.toDtoList(faculties);
    }
}
