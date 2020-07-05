package com.meomeo.ung_dung_quan_ly_khach_hang.service.impl;

import com.meomeo.ung_dung_quan_ly_khach_hang.model.Customer;
import com.meomeo.ung_dung_quan_ly_khach_hang.model.Province;
import com.meomeo.ung_dung_quan_ly_khach_hang.repository.CustomerRepository;
import com.meomeo.ung_dung_quan_ly_khach_hang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiecImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}
