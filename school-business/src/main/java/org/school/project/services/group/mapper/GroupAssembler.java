package org.school.project.services.group.mapper;

import org.school.project.entities.Group;
import org.school.project.services.group.dto.GroupDto;
import org.school.project.utils.Assembler;
import org.springframework.stereotype.Component;

@Component
public class GroupAssembler extends Assembler<GroupDto, Group> {
    @Override
    public GroupDto toDto(Group model) {
        return null;
    }

    @Override
    public Group fromDto(GroupDto dto) {
        return null;
    }
}
