package com.codegym.furama_resort.repository.hotelService;

import com.codegym.furama_resort.model.hotelService.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Integer> {
}
