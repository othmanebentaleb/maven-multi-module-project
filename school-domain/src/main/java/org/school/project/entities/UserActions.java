package org.school.project.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Table(name="utilisateur_activities")
@Entity
@Data
public class UserActions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idUtilisateur", updatable=false)
    private User user;

    @Column(name = "validSessionDate")
    private String validSessionDate;

    @Column(name = "invalidSessionDate")
    private String invalidSessionDate;


}
