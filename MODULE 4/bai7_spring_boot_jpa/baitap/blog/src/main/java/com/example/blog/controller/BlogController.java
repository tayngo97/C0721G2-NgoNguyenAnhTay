package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.repository.ECommerceRepository;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;
    @Autowired
    ECommerceRepository eCommerceRepository;

    @GetMapping("")
    public String displayBlog(Optional<String> author,
                              Optional<Integer> ecomId,
                              Model model,
                              @PageableDefault(size = 3)
                              Pageable pageable) {
        if (!author.isPresent()) {
            if (ecomId.isPresent()) {
                model.addAttribute("blogs",
                        blogService.findAllBlogByECommerce(ecomId.get(), pageable));
                model.addAttribute("ecomId", ecomId.get());
            } else model.addAttribute("blogs", blogService.findAllBlog(pageable));
        } else {
            model.addAttribute("blogs", blogService.findAllBlogByName(author.get(), pageable));
            model.addAttribute("author", author.get());
        }
        model.addAttribute("ecommer",eCommerceRepository.findAll());
        return "list";
    }

}
