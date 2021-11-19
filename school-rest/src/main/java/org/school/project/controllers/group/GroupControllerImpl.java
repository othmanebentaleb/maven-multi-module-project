package org.school.project.controllers.group;

import org.school.project.services.group.GroupService;
import org.school.project.services.group.dto.GroupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupControllerImpl implements GroupController {

    private GroupService service;

    @Autowired
    public GroupControllerImpl(GroupService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<GroupDto>> selectGroupes() {
        List<GroupDto> result = this.service.selectGroupes();
        return ResponseEntity.ok(result);
    }
}
