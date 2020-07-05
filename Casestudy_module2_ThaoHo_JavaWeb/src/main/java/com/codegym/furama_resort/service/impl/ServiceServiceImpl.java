package com.codegym.furama_resort.service.impl;

import com.codegym.furama_resort.model.hotelService.Service;
import com.codegym.furama_resort.repository.hotelService.ServiceRepository;
import com.codegym.furama_resort.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements GenericService<Service,Integer> {
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Iterable<Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Page<Service> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Service> search(String q) {
        return null;
    }

    @Override
    public Service findOne(Integer id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void delete(Service service) {
        serviceRepository.delete(service);
    }
}
