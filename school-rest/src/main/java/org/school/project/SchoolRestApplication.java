package org.school.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "org.school.project")
public class SchoolRestApplication  {
    @Autowired
    private Environment environment;
    public static void main(String[] args) {
        SpringApplication.run(SchoolRestApplication.class);
    }
    @PostConstruct
    public void test(){
        String[] activeProfiles = this.environment.getActiveProfiles();
        for(String profile:activeProfiles) {
            System.out.print(profile);
        }
    }
}
