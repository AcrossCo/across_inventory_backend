package com.across.inventory.service.brand.impl;

import com.across.inventory.model.Brand;
import com.across.inventory.repository.BrandRepository;
import com.across.inventory.service.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> getBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Brand save(Brand brand) {
        System.out.println(brand);
        return brandRepository.save(brand);
    }

    @Override
    public Optional<Brand> getBrandById(int id) {
        return brandRepository.findById(id);
    }

    @Override
    public void deleteBrand(int id) {
        brandRepository.deleteById(id);
    }
}
