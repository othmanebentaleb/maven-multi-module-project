package org.school.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.school.project")
public class SchoolRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolRestApplication.class);
    }
}
