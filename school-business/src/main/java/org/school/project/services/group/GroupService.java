package org.school.project.services.group;


import org.school.project.services.group.dto.GroupDto;

import java.util.List;

public interface GroupService {

    public List<GroupDto> selectGroupes();
}
