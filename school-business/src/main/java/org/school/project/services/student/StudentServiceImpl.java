package org.school.project.services.student;

import org.school.project.entities.Student;
import org.school.project.repositories.StudentRepository;
import org.school.project.services.student.dto.StudentDto;
import org.school.project.services.student.mapper.StudentAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository repository;

    private StudentAssembler assembler;

    @Autowired
    public StudentServiceImpl(StudentRepository repository, StudentAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @Override
    public List<StudentDto> selectStudents() {
        List<Student> result = this.repository.findAll();

        return this.assembler.toDtoList(result);
    }

    @Override
    public List<StudentDto> selectStudentsByInscriptionDate(Date date) {
        return null;
    }

    @Override
    public List<StudentDto> selectStudentsByIdFaculty(int id) {
        return null;
    }

    @Override
    public List<StudentDto> selectStudentsByIdLevel(int id) {
        return null;
    }
}
