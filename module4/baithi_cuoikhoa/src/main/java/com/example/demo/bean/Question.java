package com.example.demo.bean;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Question implements Validator{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_question_type")
    private QuestionType id_question_type;

    @NotBlank(message = "Can not be null !")
    @Size(min = 5,max = 100,message = "Title have to from 5 to 100 character !")
    private String title;


//    @NotBlank(message = "Can not be null !")
//    @Size(min = 10,max = 500,message = "Question have to from 5 to 100 character !")
    private String question;

    @NotBlank(message = "Can not be null !")
    private String answer;

    @NotBlank(message = "Can not be null !")
    private String date_create;

    @NotBlank(message = "Can not be null !")
    private String status;

    public Question() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public QuestionType getId_question_type() {
        return id_question_type;
    }

    public void setId_question_type(QuestionType id_question_type) {
        this.id_question_type = id_question_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public String getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDate_create() {
        return date_create;
    }

    public void setDate_create(String date_create) {
        this.date_create = date_create;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }


}
