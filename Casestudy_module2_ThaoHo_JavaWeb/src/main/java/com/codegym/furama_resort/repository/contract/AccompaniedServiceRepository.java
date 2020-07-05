package com.codegym.furama_resort.repository.contract;

import com.codegym.furama_resort.model.contract.AccompaniedService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccompaniedServiceRepository extends JpaRepository<AccompaniedService,Integer> {
}
