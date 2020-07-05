package com.meomeo.blog_application_mini_project.repository;

import com.meomeo.blog_application_mini_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
