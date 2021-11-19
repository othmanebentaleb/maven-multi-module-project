package org.school.project.services.nationality.mapper;

import org.school.project.entities.Nationality;
import org.school.project.services.nationality.dto.NationalityDto;
import org.school.project.utils.Assembler;
import org.springframework.stereotype.Component;

@Component
public class NationalityAssembler extends Assembler<NationalityDto, Nationality> {
    @Override
    public NationalityDto toDto(Nationality model) {
        return null;
    }

    @Override
    public Nationality fromDto(NationalityDto dto) {
        return null;
    }
}
