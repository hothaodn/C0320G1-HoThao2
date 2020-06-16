package com.example.demo.repository.impl;

import com.example.demo.models.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private  static Map<Integer, Student> listStudents;

    static {
        listStudents = new HashMap<>();
        listStudents.put(1,new Student(1,"Taylor","taylor@hotmail.com"));
        listStudents.put(2,new Student(2,"Katy","katy@hotmail.com"));
        listStudents.put(3,new Student(3,"Avril","arv@hotmail.com"));
        listStudents.put(4,new Student(4,"Kelly","ke@hotmail.com"));
        listStudents.put(5,new Student(5,"Bom","bom@hotmail.com"));
        listStudents.put(6,new Student(6,"Min Kyung","min@hotmail.com"));
    }
    @Override
    public List<Student> getAll() {
        return new ArrayList<>(listStudents.values());
    }

    @Override
    public Student getByID(int id) {
        return listStudents.get(id);
    }

    @Override
    public void deleleById(int id) {
        listStudents.remove(id);
    }

    @Override
    public void save(Student student) {
        listStudents.put(student.getId(),student);
    }
}
