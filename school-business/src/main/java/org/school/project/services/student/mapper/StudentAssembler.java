package org.school.project.services.student.mapper;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.school.project.entities.Student;
import org.school.project.services.student.dto.StudentDto;
import org.school.project.utils.Assembler;
import org.springframework.stereotype.Component;

@Component
public class StudentAssembler extends Assembler<StudentDto, Student> {

    private Mapper mapper;

    public StudentAssembler() {
        this.mapper = new DozerBeanMapper();
    }

    @Override
    public StudentDto toDto(Student model) {
        StudentDto dto = mapper.map(model,StudentDto.class);
        return dto;
    }

    @Override
    public Student fromDto(StudentDto dto) {
        Student model = mapper.map(dto,Student.class);
        return model;
    }
}
