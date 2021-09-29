package models.person;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String name;
    private String birthday;
    private String gender;
    private int CMND;
    private int phoneNumber;
    private String email;

    public Person(String name, String birthday, String gender, int CMND, int phoneNumber, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", CMND=" + CMND +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'';
    }
}
