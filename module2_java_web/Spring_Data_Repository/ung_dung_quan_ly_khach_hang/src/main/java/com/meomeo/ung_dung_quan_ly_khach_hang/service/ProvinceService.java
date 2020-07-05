package com.meomeo.ung_dung_quan_ly_khach_hang.service;

import com.meomeo.ung_dung_quan_ly_khach_hang.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
