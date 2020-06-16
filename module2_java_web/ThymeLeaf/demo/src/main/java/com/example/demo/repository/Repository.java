package com.example.demo.repository;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();
    T getByID(int id);
    void deleleById(int id);
    void save(T t);
}
