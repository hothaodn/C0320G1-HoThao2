package com.blog_security.service;
import com.blog_security.model.Post;
import org.springframework.data.domain.Page;


import java.util.List;

public interface PostService {

    Page<Post> findAll(int page);
    Post findById(Long id);
    void save(Post post);
    void remove(Long id);
    Page<Post> findAllByTitleAndCategory(String title, String category, int page);
    List<Post> findAll();

}
