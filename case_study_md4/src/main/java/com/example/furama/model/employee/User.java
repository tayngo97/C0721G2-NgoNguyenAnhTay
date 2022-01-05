package com.example.furama.model.employee;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {


    @Id
    @GeneratedValue
    private String userName;


    private String passWord;

    @ManyToMany(mappedBy = "users")
    private Set<Role> role;

    @OneToMany(targetEntity = Employee.class,mappedBy = "username")
    private List<Employee> employees;



    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
