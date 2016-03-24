package org.proffart.meddocs.model.user;

import org.proffart.meddocs.model.util.Gender;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

/**
 * team ProffArt
 * author Ashot Mnatsakanyan
 * date 1/15/16
 * time 4:54 PM
 */
@Entity
@DiscriminatorValue("PATIENT")
public class Patient extends User {

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String patronymicName;
    @Column
    private Gender gender;
    @Column
    private String phone;
    @Column
    private Date birthDay;
    @Column
    private String address;
    @Column
    private Date lastVisitedDate;

    // Properties Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getLastVisitedDate() {
        return lastVisitedDate;
    }

    public void setLastVisitedDate(Date lastVisitedDate) {
        this.lastVisitedDate = lastVisitedDate;
    }
    
}
