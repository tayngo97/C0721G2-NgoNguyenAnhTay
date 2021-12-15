package com.example.demo.service.impl;

import com.example.demo.bean.QuestionType;
import com.example.demo.repo.IQuestionTypeRepo;
import com.example.demo.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeService implements IQuestionTypeService {
    @Autowired
    private IQuestionTypeRepo iQuestionTypeRepo;


    @Override
    public List<QuestionType> findAll() {
        return iQuestionTypeRepo.findAll();
    }
}
