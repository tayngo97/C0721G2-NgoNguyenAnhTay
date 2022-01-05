package com.example.furama.model.service;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameRentType;

    private double rent_cost;



    @OneToMany(targetEntity = Services.class,mappedBy = "rentType")
    private List<Services> service;


    public RentType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public double getRent_cost() {
        return rent_cost;
    }

    public void setRent_cost(double rent_cost) {
        this.rent_cost = rent_cost;
    }

    public List<Services> getService() {
        return service;
    }

    public void setService(List<Services> service) {
        this.service = service;
    }
}
