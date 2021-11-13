package org.school.project.controllers.group;

import org.school.project.services.group.GroupBusiness;
import org.school.project.services.group.dto.GroupDto;
import org.school.project.services.student.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/group")
public class GroupControllerImpl implements GroupController {

    @Autowired
    private GroupBusiness business;

    @GetMapping
    public ResponseEntity<List<GroupDto>> selectGroupes() {
        List<GroupDto> result = this.business.selectGroupes();
        return ResponseEntity.ok(result);
    }
}
