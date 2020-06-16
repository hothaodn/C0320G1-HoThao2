package services.impl;

import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;
import services.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.getAll();
    }

    @Override
    public Student getStudentByID(int id) {
        return studentRepository.getByID(id);
    }

    @Override
    public void deleleStudentById(int id) {
        studentRepository.deleleById(id);
    }

    @Override
    public void saveStudentById(Student student) {
        studentRepository.save(student);
    }
}
