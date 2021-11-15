package org.school.project.services.student.mapper;

import org.school.project.entities.*;
import org.school.project.samples.dto.*;
import org.school.project.services.faculty.dto.FacultyDto;
import org.school.project.services.group.dto.GroupDto;
import org.school.project.services.level.dto.LevelDto;
import org.school.project.services.nationality.dto.NationalityDto;
import org.school.project.services.student.dto.StudentDto;
import org.school.project.utils.Assembler;
import org.springframework.stereotype.Component;

@Component
public class StudentAssembler extends Assembler<StudentDto, Student> {

    @Override
    public StudentDto toDto(Student model) {
        StudentDto dto = new StudentDto();

        dto.setId(model.getId());
        dto.setBirthDay(model.getBirthDay());
        dto.setBirthLocation(model.getBirthLocation());
        dto.setCin(model.getCin());
        dto.setCne(model.getCne());
        dto.setEmail(model.getEmail());
        dto.setImagePath(model.getImagePath());
        dto.setGender(model.getGender());
        dto.setFirstName(model.getFirstName());
        dto.setSecondName(model.getSecondName());
        dto.setProvenance(model.getProvenance());
        dto.setInscriptionDate(model.getInscriptionDate());

        dto.setFaculty(new FacultyDto());
        dto.getFaculty().setId(model.getFaculty().getId());
        dto.getFaculty().setFaculty(model.getFaculty().getFaculty());
        dto.getFaculty().setBrief(model.getFaculty().getBrief());

        dto.setGroup(new GroupDto());
        dto.getGroup().setId(model.getGroup().getId());
        dto.getGroup().setGroup(model.getGroup().getGroup());

        dto.setNationality(new NationalityDto());
        dto.getNationality().setId(model.getNationality().getId());
        dto.getNationality().setCode(model.getNationality().getCode());
        dto.getNationality().setName(model.getNationality().getName());

        dto.setLevel(new LevelDto());
        dto.getLevel().setId(model.getLevel().getId());
        dto.getLevel().setLevel(model.getLevel().getLevel());
        dto.getLevel().setYear(new YearDto());
        dto.getLevel().getYear().setId(model.getLevel().getYear().getId());
        dto.getLevel().getYear().setYear(model.getLevel().getYear().getYear());

        dto.setSchooling(new SchoolingDto());
        dto.getSchooling().setId(model.getSchooling().getId());
        dto.getSchooling().setBacNumber(model.getSchooling().getBacNumber());
        dto.getSchooling().setCity(model.getSchooling().getCity());
        dto.getSchooling().setYear(model.getSchooling().getYear());
        dto.getSchooling().setMention(model.getSchooling().getMention());
        dto.getSchooling().setSerie(model.getSchooling().getSerie());

        dto.setParentInfo(new ParentInfoDto());
        dto.getParentInfo().setAdress(model.getParentInfo().getAdress());
        dto.getParentInfo().setFatherEmail(model.getParentInfo().getFatherEmail());
        dto.getParentInfo().setFatherPhone(model.getParentInfo().getFatherPhone());
        dto.getParentInfo().setId(model.getParentInfo().getId());
        dto.getParentInfo().setFatherProfession(model.getParentInfo().getFatherProfession());
        dto.getParentInfo().setMotherPhone(model.getParentInfo().getMotherPhone());
        dto.getParentInfo().setMotherProfession(model.getParentInfo().getMotherProfession());
        dto.getParentInfo().setResidencePhone(model.getParentInfo().getResidencePhone());

        return dto;
    }

    @Override
    public Student fromDto(StudentDto dto) {

        Student model = new Student();

        model.setBirthDay(dto.getBirthDay());
        model.setBirthLocation(dto.getBirthLocation());
        model.setCin(dto.getCin());
        model.setCne(dto.getCne());
        model.setEmail(dto.getEmail());
        model.setImagePath(dto.getImagePath());
        model.setGender(dto.getGender());
        model.setFirstName(dto.getFirstName());
        model.setSecondName(dto.getSecondName());
        model.setProvenance(dto.getProvenance());
        model.setInscriptionDate(dto.getInscriptionDate());

        model.setFaculty(new Faculty());
        model.getFaculty().setId(dto.getFaculty().getId());
        model.getFaculty().setFaculty(dto.getFaculty().getFaculty());
        model.getFaculty().setBrief(dto.getFaculty().getBrief());

        model.setGroup(new Group());
        model.getGroup().setId(dto.getGroup().getId());
        model.getGroup().setGroup(dto.getGroup().getGroup());

        model.setNationality(new Nationality());
        model.getNationality().setId(dto.getNationality().getId());
        model.getNationality().setCode(dto.getNationality().getCode());
        model.getNationality().setName(dto.getNationality().getName());

        model.setLevel(new Level());
        model.getLevel().setId(dto.getLevel().getId());
        model.getLevel().setLevel(dto.getLevel().getLevel());

        model.getLevel().setYear(new Year());
        model.getLevel().getYear().setYear(dto.getLevel().getYear().getYear());

        model.setSchooling(new Schooling());
        model.getSchooling().setBacNumber(dto.getSchooling().getBacNumber());
        model.getSchooling().setCity(dto.getSchooling().getCity());
        model.getSchooling().setYear(dto.getSchooling().getYear());
        model.getSchooling().setMention(dto.getSchooling().getMention());
        model.getSchooling().setSerie(dto.getSchooling().getSerie());

        model.setParentInfo(new ParentInfo());
        model.getParentInfo().setAdress(dto.getParentInfo().getAdress());
        model.getParentInfo().setFatherEmail(dto.getParentInfo().getFatherEmail());
        model.getParentInfo().setFatherPhone(dto.getParentInfo().getFatherPhone());
        model.getParentInfo().setId(dto.getParentInfo().getId());
        model.getParentInfo().setFatherProfession(dto.getParentInfo().getFatherProfession());
        model.getParentInfo().setMotherPhone(dto.getParentInfo().getMotherPhone());
        model.getParentInfo().setMotherProfession(dto.getParentInfo().getMotherProfession());
        model.getParentInfo().setResidencePhone(dto.getParentInfo().getResidencePhone());

        return model;
    }
}
