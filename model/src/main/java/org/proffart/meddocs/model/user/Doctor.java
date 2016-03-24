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
@DiscriminatorValue("DOCTOR")
public class Doctor extends User {

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String patronymicName;
    @Column
    private String phone;
    @Column
    private Gender gender;
    @Column
    private Date birthDay;
    @Column
    private String address;
    @Column
    private String zipCode;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
