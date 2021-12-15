package com.example.demo.service;

import com.example.demo.bean.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IQuesTionService {
    Page<Question> findAllQuesTions(Pageable pageable);

    void save(Question question);

    Optional<Question> findById(Integer id);

    void remove(Integer id);

    Page<Question> findByKeyWord(String keyword,Pageable pageable);

//    List<Question> findQuestionsWithSorting(String field);
}
