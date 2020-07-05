package com.meomeo.blog_application_mini_project.service;

import com.meomeo.blog_application_mini_project.model.User;

import java.util.List;

public interface UserService {
    Iterable<User> findAll();

    List<User> search(String q);

    User findOne(Integer id);

    void save(User user);

    void delete(User user);
}
