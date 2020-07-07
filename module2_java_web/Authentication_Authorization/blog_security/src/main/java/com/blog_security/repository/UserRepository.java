package com.blog_security.repository;

import com.blog_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findAllByUserName(String userName);
}
