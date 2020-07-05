package com.meomeo.blog_application_mini_project.repository;

import com.meomeo.blog_application_mini_project.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost,Integer> {
    List<BlogPost> findByTitleContaining(String q);
}
