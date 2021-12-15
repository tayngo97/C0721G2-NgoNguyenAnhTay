package com.example.demo.controller;

import com.example.demo.bean.Question;
import com.example.demo.bean.QuestionType;
import com.example.demo.service.IQuesTionService;
import com.example.demo.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller()
@RequestMapping("question")
public class QuestionController {
    @Autowired
    private IQuesTionService iQuesTionService;

    @Autowired
    private IQuestionTypeService iQuestionTypeServicel;

    @ModelAttribute("question_type")
    private List<QuestionType> customerTypes() {
        return iQuestionTypeServicel.findAll();
    }


    @GetMapping("")
    public String show(String keyword, Model model,@PageableDefault(value = 10) Pageable pageable) {
        if (keyword != null) {
            model.addAttribute("questions", iQuesTionService.findByKeyWord(keyword, pageable));
        } else model.addAttribute("questions", iQuesTionService.findAllQuesTions(pageable));
        return "question/list";
    }

    @GetMapping("create")
    public String showCreateForm(Model model) {
        model.addAttribute("question", new Question());
        return "question/create";
    }

    @PostMapping("save")
    public String save(@Valid @ModelAttribute("question") Question question,BindingResult bindingResult,Model model) {
        new Question().validate(question,bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("question_type", this.iQuestionTypeServicel.findAll());
            return "question/create";
        }
        this.iQuesTionService.save(question);
        return "redirect:/question/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("question", iQuesTionService.findById(id).get());
        return "question/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("customer") Question question) {
        iQuesTionService.remove(question.getId());
        return "redirect:/question/";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("question", iQuesTionService.findById(id));
        return "question/edit";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("question", iQuesTionService.findById(id).get());
        return "question/detail";
    }
}
