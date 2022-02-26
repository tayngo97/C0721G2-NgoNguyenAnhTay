package com.c0821g1.sprint1.entity.employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class EmployeePosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeePositionId;
    private String employeePositionName;

    @OneToMany(mappedBy = "employeePosition")
    private List<Employee> employeeList;

    public EmployeePosition() {
    }

    public EmployeePosition(int employeePositionId, String employeePositionName, List<Employee> employeeList) {
        this.employeePositionId = employeePositionId;
        this.employeePositionName = employeePositionName;
        this.employeeList = employeeList;
    }
}
