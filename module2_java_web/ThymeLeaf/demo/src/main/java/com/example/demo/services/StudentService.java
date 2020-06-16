package com.example.demo.services;

import com.example.demo.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentByID(int id);
    void deleleStudentById(int id);
    void saveStudentById(Student student);
}
