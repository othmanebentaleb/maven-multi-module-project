package org.school.project.services.group;

import org.school.project.entities.Group;
import org.school.project.repositories.GroupRepository;
import org.school.project.services.group.dto.GroupDto;
import org.school.project.services.group.mapper.GroupAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    private GroupRepository repository;

    private GroupAssembler assembler;

    @Autowired
    public GroupServiceImpl(GroupRepository repository, GroupAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @Override
    public List<GroupDto> selectGroupes() {
        List<Group> result = this.repository.findAll();
        return this.assembler.toDtoList(result);
    }
}
