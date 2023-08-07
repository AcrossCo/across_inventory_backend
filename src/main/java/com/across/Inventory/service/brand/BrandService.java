package com.across.inventory.service.brand;

import com.across.inventory.model.Brand;

import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */
public interface BrandService {
    List<Brand> getBrands();

    Brand save(Brand brand);

    Optional<Brand> getBrandById(int id);

    public void deleteBrand(int id);
}
