package org.school.project.controllers.student;

import org.school.project.services.student.StudentService;
import org.school.project.services.student.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControllerImpl implements StudentController {

    private StudentService service;

    @Autowired
    public StudentControllerImpl(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> selectStudents() {
        List<StudentDto> result = this.service.selectStudents();
        return ResponseEntity.ok(result);
    }

    public ResponseEntity<List<StudentDto>> selectStudentsByInscriptionDate(Date date) {
        return null;
    }

    public ResponseEntity<List<StudentDto>> selectStudentsByIdFaculty(int id) {
        return null;
    }

    public ResponseEntity<List<StudentDto>> selectStudentsByIdLevel(int id) {
        return null;
    }
}
