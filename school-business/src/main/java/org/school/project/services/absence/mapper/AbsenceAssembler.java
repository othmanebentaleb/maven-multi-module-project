package org.school.project.services.absence.mapper;

import org.school.project.entities.Absence;
import org.school.project.entities.Student;
import org.school.project.entities.Subject;
import org.school.project.samples.dto.*;
import org.school.project.services.absence.dto.AbsenceDto;
import org.school.project.services.faculty.dto.FacultyDto;
import org.school.project.services.group.dto.GroupDto;
import org.school.project.services.level.dto.LevelDto;
import org.school.project.services.nationality.dto.NationalityDto;
import org.school.project.services.student.dto.StudentDto;
import org.school.project.utils.Assembler;
import org.springframework.stereotype.Component;

import java.util.Objects;

// TO COMPLETE
@Component
public class AbsenceAssembler extends Assembler<AbsenceDto, Absence> {

    //TODO : add subject
    @Override
    public AbsenceDto toDto(Absence model) {
        AbsenceDto dto = new AbsenceDto();

        dto.setId(model.getId());
        dto.setCall(model.getCall());
        dto.setControl(model.getControl());
        dto.setYear(new YearDto());

        dto.getYear().setId(model.getYear().getId());
        dto.getYear().setYear(model.getYear().getYear());

        dto.setDate(model.getDate());
        dto.setMotif(model.getMotif());
        dto.setSession(model.getSession());

        StudentDto studentDto = new StudentDto();

        if(Objects.nonNull(model.getStudent())) {

            studentDto = getStudentDto(model.getStudent());
        }

        dto.setStudent(studentDto);
        dto.setSubject(new Subject());


        return dto;
    }

    private StudentDto getStudentDto(Student studentModel) {
        StudentDto studentDto = new StudentDto();

        studentDto.setId(studentModel.getId());
        studentDto.setBirthDay(studentModel.getBirthDay());
        studentDto.setBirthLocation(studentModel.getBirthLocation());
        studentDto.setCin(studentModel.getCin());
        studentDto.setCne(studentModel.getCne());
        studentDto.setEmail(studentModel.getEmail());
        studentDto.setImagePath(studentModel.getImagePath());
        studentDto.setGender(studentModel.getGender());
        studentDto.setFirstName(studentModel.getFirstName());
        studentDto.setSecondName(studentModel.getSecondName());
        studentDto.setProvenance(studentModel.getProvenance());
        studentDto.setInscriptionDate(studentModel.getInscriptionDate());

        studentDto.setFaculty(new FacultyDto());
        studentDto.getFaculty().setId(studentModel.getFaculty().getId());
        studentDto.getFaculty().setFaculty(studentModel.getFaculty().getFaculty());
        studentDto.getFaculty().setBrief(studentModel.getFaculty().getBrief());

        studentDto.setGroup(new GroupDto());
        studentDto.getGroup().setId(studentModel.getGroup().getId());
        studentDto.getGroup().setGroup(studentModel.getGroup().getGroup());

        studentDto.setNationality(new NationalityDto());
        studentDto.getNationality().setId(studentModel.getNationality().getId());
        studentDto.getNationality().setCode(studentModel.getNationality().getCode());
        studentDto.getNationality().setName(studentModel.getNationality().getName());

        studentDto.setLevel(new LevelDto());
        studentDto.getLevel().setId(studentModel.getLevel().getId());
        studentDto.getLevel().setLevel(studentModel.getLevel().getLevel());

        studentDto.getLevel().setYear(new YearDto());
        studentDto.getLevel().getYear().setId(studentModel.getLevel().getYear().getId());
        studentDto.getLevel().getYear().setYear(studentModel.getLevel().getYear().getYear());

        studentDto.setSchooling(new SchoolingDto());
        studentDto.getSchooling().setId(studentModel.getSchooling().getId());
        studentDto.getSchooling().setBacNumber(studentModel.getSchooling().getBacNumber());
        studentDto.getSchooling().setCity(studentModel.getSchooling().getCity());
        studentDto.getSchooling().setYear(studentModel.getSchooling().getYear());
        studentDto.getSchooling().setMention(studentModel.getSchooling().getMention());
        studentDto.getSchooling().setSerie(studentModel.getSchooling().getSerie());

        ParentInfoDto parentInfoDto = new ParentInfoDto();
        if(Objects.nonNull(studentModel.getParentInfo())) {
            parentInfoDto = getParentInfoDto(studentModel);
        }

        studentDto.setParentInfo(parentInfoDto);
        return studentDto;
    }

    private ParentInfoDto getParentInfoDto(Student studentModel) {

        ParentInfoDto dto = new ParentInfoDto();
        dto.setAdress(studentModel.getParentInfo().getAdress());
        dto.setFatherEmail(studentModel.getParentInfo().getFatherEmail());
        dto.setFatherPhone(studentModel.getParentInfo().getFatherPhone());
        dto.setId(studentModel.getParentInfo().getId());
        dto.setFatherProfession(studentModel.getParentInfo().getFatherProfession());
        dto.setMotherPhone(studentModel.getParentInfo().getMotherPhone());
        dto.setMotherProfession(studentModel.getParentInfo().getMotherProfession());
        dto.setResidencePhone(studentModel.getParentInfo().getResidencePhone());

        return dto;
    }

    @Override
    public Absence fromDto(AbsenceDto dto) {
        return null;
    }
}
