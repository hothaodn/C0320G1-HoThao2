package com.meomeo.quan_ly_khach_hang_restful.service;

import com.meomeo.quan_ly_khach_hang_restful.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
