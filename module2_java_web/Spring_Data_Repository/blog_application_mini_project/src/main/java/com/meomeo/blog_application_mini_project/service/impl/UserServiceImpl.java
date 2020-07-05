package com.meomeo.blog_application_mini_project.service.impl;

import com.meomeo.blog_application_mini_project.model.User;
import com.meomeo.blog_application_mini_project.repository.UserRepository;
import com.meomeo.blog_application_mini_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> search(String q) {
        return null;
    }

    @Override
    public User findOne(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
