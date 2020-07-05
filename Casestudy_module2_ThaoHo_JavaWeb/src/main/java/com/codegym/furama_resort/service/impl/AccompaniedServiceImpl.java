package com.codegym.furama_resort.service.impl;

import com.codegym.furama_resort.model.contract.AccompaniedService;
import com.codegym.furama_resort.repository.contract.AccompaniedServiceRepository;
import com.codegym.furama_resort.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class AccompaniedServiceImpl implements GenericService<AccompaniedService,Integer> {
    @Autowired
    private AccompaniedServiceRepository accompaniedServiceRepository;

    @Override
    public Iterable<AccompaniedService> findAll() {
        return accompaniedServiceRepository.findAll();
    }

    @Override
    public Page<AccompaniedService> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<AccompaniedService> search(String q) {
        return null;
    }

    @Override
    public AccompaniedService findOne(Integer id) {
        return accompaniedServiceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(AccompaniedService accompaniedService) {
        accompaniedServiceRepository.save(accompaniedService);
    }

    @Override
    public void delete(AccompaniedService accompaniedService) {
        accompaniedServiceRepository.delete(accompaniedService);
    }
}
