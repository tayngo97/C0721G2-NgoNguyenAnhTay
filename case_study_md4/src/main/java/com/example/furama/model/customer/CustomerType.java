package com.example.furama.model.customer;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customer_type")
public class CustomerType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer type_id;

    private String type_name;


    @OneToMany(targetEntity = Customer.class,mappedBy = "type_id")
    private List<Customer> customers;


    public CustomerType() {
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
