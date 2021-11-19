package org.school.project.services.student;

import org.school.project.services.student.dto.StudentDto;

import java.util.Date;
import java.util.List;

public interface StudentService {

    public List<StudentDto> selectStudents();

    public List<StudentDto> selectStudentsByInscriptionDate(Date date);

    public List<StudentDto> selectStudentsByIdFaculty(int id);

    public List<StudentDto> selectStudentsByIdLevel(int id);
}
