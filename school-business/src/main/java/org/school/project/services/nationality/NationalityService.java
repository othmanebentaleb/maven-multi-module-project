package org.school.project.services.nationality;

import org.school.project.services.nationality.dto.NationalityDto;

import java.util.List;

public interface NationalityService {

    public List<NationalityDto> selectNationalities();
}
