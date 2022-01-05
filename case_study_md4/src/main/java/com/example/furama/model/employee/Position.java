package com.example.furama.model.employee;


import javax.persistence.*;
import java.util.List;

@Entity
public class Position {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @OneToMany(targetEntity = Employee.class)
    private Integer positionId;

    @OneToMany(targetEntity = Employee.class,mappedBy = "position")
    private List<Employee> employees;

    private String positionName;

    public Integer getPositionId() {
        return positionId;
    }

    public Position() {
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
