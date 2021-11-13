package org.school.project.services.faculty.mapper;

import org.school.project.entities.Faculty;
import org.school.project.services.faculty.dto.FacultyDto;
import org.school.project.utils.Assembler;
import org.springframework.stereotype.Component;

@Component
public class FacultyAssembler extends Assembler<FacultyDto, Faculty> {
    @Override
    public FacultyDto toDto(Faculty model) {
        return null;
    }

    @Override
    public Faculty fromDto(FacultyDto dto) {
        return null;
    }
}
