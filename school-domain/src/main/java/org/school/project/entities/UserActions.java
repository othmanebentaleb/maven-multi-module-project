package org.school.project.entities;

import javax.persistence.*;

@Table(name="utilisateur_activities")
@Entity
public class UserActions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idUtilisateur", unique=false, nullable=true, insertable=true, updatable=false)
    private User user;

    @Column(name = "validSessionDate")
    private String validSessionDate;

    @Column(name = "invalidSessionDate")
    private String invalidSessionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getValidSessionDate() {
        return validSessionDate;
    }

    public void setValidSessionDate(String validSessionDate) {
        this.validSessionDate = validSessionDate;
    }

    public String getInvalidSessionDate() {
        return invalidSessionDate;
    }

    public void setInvalidSessionDate(String invalidSessionDate) {
        this.invalidSessionDate = invalidSessionDate;
    }
}
