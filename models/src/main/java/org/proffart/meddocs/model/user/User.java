package org.proffart.meddocs.model.user;

import javax.persistence.*;

/**
 * team ProffArt
 * author Ashot Mnatsakanyan
 * date 1/15/16
 * time 4:31 PM
 */
@Entity
@Inheritance
@DiscriminatorColumn(name="role")
public abstract class User {

    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String userName;
    @Column
    private String email;
    @Column
    private String passwordHash;
    @Column
    private String password;
    @Column
    private Boolean enabled;

    // Properties Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}