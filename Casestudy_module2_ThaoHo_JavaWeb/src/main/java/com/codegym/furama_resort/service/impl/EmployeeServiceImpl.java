package com.codegym.furama_resort.service.impl;

import com.codegym.furama_resort.model.employee.Employee;
import com.codegym.furama_resort.repository.employee.EmployeeRepository;
import com.codegym.furama_resort.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements GenericService<Employee,Long> {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Page<Employee> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Employee> search(String q) {
        return null;
    }

    @Override
    public Employee findOne(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }
}
