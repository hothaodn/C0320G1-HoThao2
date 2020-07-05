package com.codegym.furama_resort.repository.customer;

import com.codegym.furama_resort.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findAllByNameCustomerContaining(String nameCustomer);

    List<Customer> findAllByNameCustomerContainingAndPhoneNumberContainingAndEmailContaining(
            String name,
            String phone,
            String email
    );

    List<Customer> findAllByCodeCustomerContainingAndNameCustomerContainingAndBirthdayContainingAndIdCardNumberContainingAndPhoneNumberContainingAndEmailContainingAndCustomerType(
            String code,
            String name,
            String  birthday,
            String idCard,
            String phone,
            String email,
            String type
    );
}
