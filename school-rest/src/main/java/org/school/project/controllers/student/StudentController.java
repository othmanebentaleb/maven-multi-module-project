package org.school.project.controllers.student;

import org.school.project.services.student.dto.StudentDto;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;

public interface StudentController {

    public ResponseEntity<List<StudentDto>> selectStudents();

    public ResponseEntity<List<StudentDto>> selectStudentsByInscriptionDate(Date date);

    public ResponseEntity<List<StudentDto>> selectStudentsByIdFaculty(int id);

    public ResponseEntity<List<StudentDto>> selectStudentsByIdLevel(int id);
}
