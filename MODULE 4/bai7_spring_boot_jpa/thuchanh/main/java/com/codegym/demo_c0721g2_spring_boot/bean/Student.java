package com.codegym.demo_c0721g2_spring_boot.bean;

import javax.persistence.*;

@Entity(name = "student") // Tên của table mà chúng ta mapping.
public class Student {
    @Id
    //Custom GeneratedValue.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY -> tự động tăng.
    private Integer id; //-> thuộc tính id
    @Column(name = "name")
    private String name; //-> thuộc tính name
    @Column(name = "date_of_birth", columnDefinition = "DATE")// Kiểu dữ liệu
    private String dateOfBirth; //-> thuộc tính date_of_birth
    // 0: Female, 1: Male
    @Column(name = "gender")
    private Integer gender;
    // < 5: Bad, 5 - 7: Good, 8 - 10: Excellent
    @Column(name = "grade")
    private Double grade;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassRoom classRoom;

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Student() {
    }

    public Student(Integer id, String name,
                   String dateOfBirth, Integer gender, Double grade) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
