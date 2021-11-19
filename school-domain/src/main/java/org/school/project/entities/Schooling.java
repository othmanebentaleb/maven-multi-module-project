package org.school.project.entities;

import lombok.*;

import javax.persistence.*;

@Table(name="scolarite")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schooling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    private String bacNumber;

    private String serie;

    private String mention;

    private Integer year;

    private String city;
}
