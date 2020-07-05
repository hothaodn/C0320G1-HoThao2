package com.meomeo.blog_application_mini_project.service;

import com.meomeo.blog_application_mini_project.model.BlogPost;

import java.util.List;

public interface BlogPostService {
    Iterable<BlogPost> findAll();

    List<BlogPost> search(String q);

    BlogPost findOne(Integer id);

    void save(BlogPost post);

    void delete(BlogPost post);
}
