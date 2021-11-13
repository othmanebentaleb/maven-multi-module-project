package org.school.project.services.group;

import org.school.project.entities.Group;
import org.school.project.repositories.GroupRepository;
import org.school.project.services.group.dto.GroupDto;
import org.school.project.services.group.mapper.GroupAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupBusinessImpl implements GroupBusiness{

    @Autowired
    private GroupRepository repository;

    @Autowired
    private GroupAssembler assembler;

    @Override
    public List<GroupDto> selectGroupes() {
        List<Group> result = this.repository.findAll();
        return this.assembler.toDtoList(result);
    }
}
