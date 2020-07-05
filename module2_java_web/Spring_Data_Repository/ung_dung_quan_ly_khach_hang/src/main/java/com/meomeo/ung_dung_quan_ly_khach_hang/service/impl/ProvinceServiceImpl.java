package com.meomeo.ung_dung_quan_ly_khach_hang.service.impl;

import com.meomeo.ung_dung_quan_ly_khach_hang.model.Province;
import com.meomeo.ung_dung_quan_ly_khach_hang.repository.ProvinceRepository;
import com.meomeo.ung_dung_quan_ly_khach_hang.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }
}
