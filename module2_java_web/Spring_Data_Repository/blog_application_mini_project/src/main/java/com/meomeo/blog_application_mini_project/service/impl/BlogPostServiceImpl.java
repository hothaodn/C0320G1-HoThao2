package com.meomeo.blog_application_mini_project.service.impl;

import com.meomeo.blog_application_mini_project.model.BlogPost;
import com.meomeo.blog_application_mini_project.repository.BlogPostRepository;
import com.meomeo.blog_application_mini_project.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostServiceImpl implements BlogPostService {
    @Autowired
    private BlogPostRepository blogPostRepository;

    @Override
    public Iterable<BlogPost> findAll() {
        return blogPostRepository.findAll();
    }

    @Override
    public List<BlogPost> search(String title) {
        return blogPostRepository.findByTitleContaining(title);
    }

    @Override
    public BlogPost findOne(Integer id) {
        return blogPostRepository.findById(id).orElse(null);
    }

    @Override
    public void save(BlogPost post) {
        blogPostRepository.save(post);
    }

    @Override
    public void delete(BlogPost post) {
        blogPostRepository.delete(post);
    }
}
