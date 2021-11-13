package org.school.project.services.nationality;

import org.school.project.services.nationality.dto.NationalityDto;

import java.util.List;

public interface NationalityBusiness {

    public List<NationalityDto> selectNationalities();
}
