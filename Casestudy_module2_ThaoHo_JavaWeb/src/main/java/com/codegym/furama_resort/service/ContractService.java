package com.codegym.furama_resort.service;

import com.codegym.furama_resort.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {
    Iterable<Contract> findAll();

    Page<Contract> getAll(Pageable pageable);

    List<Contract> search(String q);

    Contract findOne(Long id);

    void save(Contract contract);

    void delete(Contract contract);

//    Iterable<Contract> findAllByIdCustomer(Long id);
}
