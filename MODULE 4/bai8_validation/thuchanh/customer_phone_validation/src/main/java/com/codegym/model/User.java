package com.codegym.model;


import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import javax.validation.constraints.*;

@Service
public class User  {

    @NotBlank(message = "Không được để trống")
    @Range(min = 5,max = 45)
    private String firstName;

    public User() {
    }

    public User(@NotBlank(message = "Không được để trống") @Range(min = 5, max = 45) String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return User.class.isAssignableFrom(clazz);
//    }

//    @Override
//    public void validate(Object target, Errors errors) {
//        User user =(User) target;
//        String number = user.getPhoneNumber();
//
//        ValidationUtils.rejectIfEmpty(errors,"phoneNumber","phoneNumber.empty");
//
//        if (number.length() != 10){
//            errors.rejectValue("phoneNumber","phoneNumber.length");
//        }
//        if (!number.startsWith("0")){
//            errors.rejectValue("phoneNumber","phoneNumber.startsWith");
//        }
//        if (!number.matches("(^$|[0-9]*$)")){
//            errors.rejectValue("phoneNumber", "phoneNumber.matches");
//        }
//    }
}
