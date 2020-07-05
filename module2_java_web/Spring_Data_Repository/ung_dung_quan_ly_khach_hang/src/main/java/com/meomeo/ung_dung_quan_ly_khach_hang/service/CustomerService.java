package com.meomeo.ung_dung_quan_ly_khach_hang.service;

import com.meomeo.ung_dung_quan_ly_khach_hang.model.Customer;
import com.meomeo.ung_dung_quan_ly_khach_hang.model.Province;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
