package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {

    List<Blog> findAll();

    Blog findById(int id);

    Page<Blog> findAllBlog(Pageable pageable);

    Page<Blog> findAllBlogByName(String name,Pageable pageable);

    Page<Blog> findAllBlogByECommerce(int id,Pageable pageable);
}
