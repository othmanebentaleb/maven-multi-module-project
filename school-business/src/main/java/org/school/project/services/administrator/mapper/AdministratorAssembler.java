package org.school.project.services.administrator.mapper;

import org.school.project.entities.Administrator;
import org.school.project.services.administrator.dto.AdministratorDto;
import org.school.project.utils.Assembler;
import org.springframework.stereotype.Component;

@Component
public class AdministratorAssembler extends Assembler<AdministratorDto, Administrator> {
    @Override
    public AdministratorDto toDto(Administrator model) {
        AdministratorDto dto = new AdministratorDto();

        dto.setId(model.getId());
        dto.setPassword(model.getPassword());
        dto.setUsername(model.getUsername());

        return dto;
    }

    @Override
    public Administrator fromDto(AdministratorDto dto) {
        Administrator model = new Administrator();

        model.setId(dto.getId());
        model.setPassword(dto.getPassword());
        model.setUsername(dto.getUsername());

        return model;
    }
}
