package com.blog_security.repository;

import com.blog_security.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

    Page<Post> findAllByTitleContainingAndCategory_NameContaining(String title, String category, Pageable pageable);
}
