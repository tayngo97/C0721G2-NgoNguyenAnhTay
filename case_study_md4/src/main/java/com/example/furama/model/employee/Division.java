package com.example.furama.model.employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer divisionId;
    private String name;

    @OneToMany(targetEntity = Employee.class,mappedBy = "division")
    private List<Employee> employees;

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

