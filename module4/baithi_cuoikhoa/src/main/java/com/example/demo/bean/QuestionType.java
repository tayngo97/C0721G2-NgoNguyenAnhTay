package com.example.demo.bean;


import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer type_id;

    private String type_name;


    @OneToMany(targetEntity = Question.class,mappedBy = "id_question_type")
    private List<Question> questions;


    public QuestionType() {
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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
