package com.codegym.model;

import javax.validation.constraints.*;

public class User {

    @NotEmpty
    @Size(min = 5,max = 45,message = "Tên phải có độ dài từ 5 đến 45 kí tự")
    private String firstName;

    @NotEmpty
    @Size(min = 5,max = 45,message = "Tên phải có độ dài từ 5 đến 45 kí tự")
    private String lastName;

    @NotEmpty
    @Pattern(regexp = "^[0][0-9]{9,10}$",message = "Số điện thoại không hợp lệ")
    private String phoneNumber;

    @Min(value = 18 , message = "Tuổi phải trên 18")
    private int age;

    @NotEmpty
    @Email(message = "Sai định dạng email Ex:abc@abc.abc")
    private String email;

    public User() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
