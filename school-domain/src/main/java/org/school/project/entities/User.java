package org.school.project.entities;

import javax.persistence.*;

@Table(name="utilisateur")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    @Column(name = "prenom")
    private String firstName;

    @Column(name = "nom")
    private String secondName;

    @Column(name = "responsableAbsence", columnDefinition="TINYINT DEFAULT false")
    private boolean canManageAbsences;

    @Column(name = "canManageAttestationReussite", columnDefinition="TINYINT DEFAULT false")
    private boolean canManageAttestationReussite;

    @Column(name = "canManageAttestationScolarite", columnDefinition="TINYINT DEFAULT false")
    private boolean canManageAttestationScolarite;

    private Boolean blockedAccount;

    @Column(name = "status", columnDefinition="TINYINT DEFAULT false")
    private boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public boolean isCanManageAbsences() {
        return canManageAbsences;
    }

    public void setCanManageAbsences(boolean canManageAbsences) {
        this.canManageAbsences = canManageAbsences;
    }

    public boolean isCanManageAttestationReussite() {
        return canManageAttestationReussite;
    }

    public void setCanManageAttestationReussite(boolean canManageAttestationReussite) {
        this.canManageAttestationReussite = canManageAttestationReussite;
    }

    public boolean isCanManageAttestationScolarite() {
        return canManageAttestationScolarite;
    }

    public void setCanManageAttestationScolarite(boolean canManageAttestationScolarite) {
        this.canManageAttestationScolarite = canManageAttestationScolarite;
    }

    public Boolean getBlockedAccount() {
        return blockedAccount;
    }

    public void setBlockedAccount(Boolean blockedAccount) {
        this.blockedAccount = blockedAccount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
