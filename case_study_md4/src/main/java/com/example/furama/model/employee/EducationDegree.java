package com.example.furama.model.employee;


import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "education_degree")
public class EducationDegree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer educationId;
    private String educationName;

    @OneToMany(targetEntity = Employee.class,mappedBy = "educationDegree")
    private List<Employee> employees;

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }
}

