package services;

import models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentByID(int id);
    void deleleStudentById(int id);
    void saveStudentById(Student student);
}
