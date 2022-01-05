package com.example.furama.model.contract;


import com.example.furama.model.customer.Customer;
import com.example.furama.model.employee.Employee;
import com.example.furama.model.service.Services;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractId;

    private Date contractStartDate;
    private Date contractEndDate;
    private double deposit;
    private double totalMoney;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @ManyToOne
    @JoinColumn(name = "service_id")
    private Services service;

    @OneToMany(targetEntity = ContractDetail.class,mappedBy = "contracts")
    private List<ContractDetail> contractDetail;


}
