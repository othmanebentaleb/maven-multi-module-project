package org.school.project.controllers.group;

import org.school.project.services.group.dto.GroupDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GroupController {

    public ResponseEntity<List<GroupDto>> selectGroupes();
}
