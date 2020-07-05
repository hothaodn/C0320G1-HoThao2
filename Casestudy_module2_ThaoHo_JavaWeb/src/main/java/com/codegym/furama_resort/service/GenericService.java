package com.codegym.furama_resort.service;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface GenericService<T,E> {
    Iterable<T> findAll();

    Page<T> getAll(Pageable pageable);

    List<T> search(String q);

    T findOne(E id);

    void save(T t);

    void delete(T t);
}
