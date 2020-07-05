package com.codegym.furama_resort.service;

import com.codegym.furama_resort.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAll();

    Page<Customer> getAll(Pageable pageable);

    Customer findOne(Long id);

    void save(Customer customer);

    void delete(Customer customer);

    List<Customer> findAllByNameCustomerContaining(String name);

    List<Customer> findByNamePhoneEmail(String name, String phone, String email);

    List<Customer> search(
            String code,
            String name,
            String  birthday,
            String idCard,
            String phone,
            String email,
            String type
    );

}
