package com.blog_security.repository;

import com.blog_security.model.Role;
import com.blog_security.model.User;
import com.blog_security.model.UserRole1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository  extends JpaRepository<UserRole1,Long> {
    List<UserRole1> findAllByUserId_UserId(Long userId);
}
