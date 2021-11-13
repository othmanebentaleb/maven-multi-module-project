package org.school.project.services.absence;

import org.school.project.services.absence.dto.AbsenceDto;
import org.school.project.services.student.dto.StudentDto;

import java.util.List;

public interface AbsenceBusiness {
    public List<AbsenceDto> selectAbsences();
}
