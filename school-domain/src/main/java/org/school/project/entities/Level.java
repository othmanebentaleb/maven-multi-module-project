package org.school.project.entities;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Table(name = "niveau")
@Entity
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "niveau")
    private String level;

    @OneToOne
    @Cascade({CascadeType.ALL})
    @JoinColumn(name="idAnnee")
    private Year year;

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    private List<Group> groupes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public List<Group> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<Group> groupes) {
        this.groupes = groupes;
    }
}
