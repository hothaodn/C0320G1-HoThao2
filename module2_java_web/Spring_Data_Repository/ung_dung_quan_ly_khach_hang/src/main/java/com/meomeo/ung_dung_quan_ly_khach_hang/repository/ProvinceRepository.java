package com.meomeo.ung_dung_quan_ly_khach_hang.repository;

import com.meomeo.ung_dung_quan_ly_khach_hang.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}
