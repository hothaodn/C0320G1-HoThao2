package com.codegym.furama_resort.service.impl;

import com.codegym.furama_resort.model.customer.Customer;
import com.codegym.furama_resort.repository.customer.CustomerRepository;
import com.codegym.furama_resort.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> getAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findOne(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public List<Customer> findAllByNameCustomerContaining(String nameCustomer) {
        return customerRepository.findAllByNameCustomerContaining(nameCustomer);
    }

    @Override
    public List<Customer> findByNamePhoneEmail(String name, String phone, String email) {
        return customerRepository.findAllByNameCustomerContainingAndPhoneNumberContainingAndEmailContaining(name,phone,email);
    }

    @Override
    public List<Customer> search(String code, String name, String birthday, String idCard, String phone, String email, String type) {
        return customerRepository.findAllByCodeCustomerContainingAndNameCustomerContainingAndBirthdayContainingAndIdCardNumberContainingAndPhoneNumberContainingAndEmailContainingAndCustomerType(code,name,birthday,idCard,phone,email,type);
    }
}
