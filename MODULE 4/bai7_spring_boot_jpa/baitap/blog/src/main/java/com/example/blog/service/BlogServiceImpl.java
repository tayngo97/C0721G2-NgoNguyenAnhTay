package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> findAllBlog(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllBlogByName(String name, Pageable pageable) {
        return blogRepository.findBlogByAuthorContaining(name,pageable);
    }

    @Override
    public Page<Blog> findAllBlogByECommerce(int id, Pageable pageable) {
        return blogRepository.findAllBlogByECommerceId(id,pageable);
    }
}
