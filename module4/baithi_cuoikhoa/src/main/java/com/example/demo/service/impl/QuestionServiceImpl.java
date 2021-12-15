package com.example.demo.service.impl;

import com.example.demo.bean.Question;
import com.example.demo.repo.IQuestionRepo;
import com.example.demo.service.IQuesTionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionServiceImpl implements IQuesTionService {
    @Autowired
    private IQuestionRepo iQuestionRepo;

    @Override
    public Page<Question> findAllQuesTions(Pageable pageable) {
        return iQuestionRepo.findAll(pageable);
    }

    @Override
    public void save(Question question) {
        iQuestionRepo.save(question);
    }

    @Override
    public Optional<Question> findById(Integer id) {
        return iQuestionRepo.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iQuestionRepo.deleteById(id);
    }

    @Override
    public Page<Question> findByKeyWord(String keyword, Pageable pageable) {
        return iQuestionRepo.findByKeyWord(keyword,pageable);
    }
}
