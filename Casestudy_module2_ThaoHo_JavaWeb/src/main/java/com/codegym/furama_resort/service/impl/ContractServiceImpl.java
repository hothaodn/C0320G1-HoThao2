package com.codegym.furama_resort.service.impl;

import com.codegym.furama_resort.model.contract.Contract;
import com.codegym.furama_resort.repository.contract.ContractRepository;
import com.codegym.furama_resort.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Iterable<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Page<Contract> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Contract> search(String q) {
        return null;
    }

    @Override
    public Contract findOne(Long id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void delete(Contract contract) {
        contractRepository.delete(contract);
    }

//    @Override
//    public Iterable<Contract> findAllByIdCustomer(Long id) {
//        return contractRepository.findAllByIdCustomer(id);
//    }
}
