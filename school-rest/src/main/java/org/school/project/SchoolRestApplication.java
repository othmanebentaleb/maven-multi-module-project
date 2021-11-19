package org.school.project;

import org.school.project.entities.Student;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.school.project.utils.StudentMapper;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "org.school.project")
public class SchoolRestApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(SchoolRestApplication.class);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    @PostConstruct
    public void postConstruct() {
        Student student = new Student().setCin("CD232925");
        System.out.println(StudentMapper.INSTANCE.studentToStudentDto(student));
    }
}
