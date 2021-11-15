package org.school.project.utils;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.school.project.entities.Student;
import org.school.project.services.student.dto.StudentDto;

import java.util.function.Function;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    Function<Student, StudentDto> STUDENT_TO_STUDENTDTO = INSTANCE::studentToStudentDto;
    Function<StudentDto, Student> STUDENTDTO_TO_STUDENT = INSTANCE::studentDtoToStudent;

    Student studentDtoToStudent(StudentDto studentDto);
    StudentDto studentToStudentDto(Student student);
    


}
