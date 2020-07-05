package com.meomeo.page_breaking_searching.service;

import com.meomeo.page_breaking_searching.model.Employee;

import java.util.List;

public interface EmployeeService {
	Iterable<Employee> findAll();

    List<Employee> search(String q);

    Employee findOne(Long id);

    void save(Employee emp);

    void delete(Employee emp);
}
