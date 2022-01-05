package com.example.furama.model.customer;


import com.example.furama.model.contract.Contract;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Customer implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="customer_type_id")
    private CustomerType type_id;

    private String name;

    @NotBlank
    private String dateOfBirt;

    @NotBlank(message = "Gender can not be null !")
    private String gender;

    @NotBlank(message = "Id Card can not be null")
    private String idCard;

    @NotBlank(message = "PhoneNumber can not be null !")
    private String phoneNumber;

    @NotBlank(message = "Email can not be null !")
    @Email(message = "Email invalid !")
    private String email;

    @NotBlank(message = "Address can not be null !")
    private String address;

    @OneToMany(targetEntity = Contract.class,mappedBy = "customer")
    private List<Contract> contractList;


    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CustomerType getType_id() {
        return type_id;
    }

    public void setType_id(CustomerType type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirt() {
        return dateOfBirt;
    }

    public void setDateOfBirt(String dateOfBirt) {
        this.dateOfBirt = dateOfBirt;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }



    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;

        if (customer.getName().equals("")){
            errors.rejectValue("name","name.null");
        }

        if (customer.idCard == null){
            errors.rejectValue("idCard","idcard_null");
        }
        else if (!customer.idCard.matches("^[K][H]-[\\d]{4}$")){
            errors.rejectValue("idCard","idCard.err");
        }

        if (!customer.phoneNumber.matches("^[0][9][0][\\d]{7}$")){
            errors.rejectValue("phoneNumber","phone_err");
        }
    }
}
