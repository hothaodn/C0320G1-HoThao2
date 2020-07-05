package com.codegym.furama_resort.repository.contract;

import com.codegym.furama_resort.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends PagingAndSortingRepository<Contract,Long> {
//    Iterable<Contract> findAllByIdCustomer(Long id);
}
