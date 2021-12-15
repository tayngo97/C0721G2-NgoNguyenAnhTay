package com.example.demo.repo;

import com.example.demo.bean.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionTypeRepo extends JpaRepository<QuestionType,Integer> {
}
