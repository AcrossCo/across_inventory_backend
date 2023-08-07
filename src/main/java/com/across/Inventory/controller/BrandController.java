package com.across.inventory.controller;

import com.across.inventory.model.Brand;
import com.across.inventory.service.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */
@Controller
@RequestMapping(path = "/api/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public ResponseEntity<List<Brand>> getBrands() {
        List<Brand> brands = brandService.getBrands();
        return ResponseEntity.ok(brands);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Brand>> getBrandById(@PathVariable int id) {
        Optional<Brand> brand = brandService.getBrandById(id);
        return ResponseEntity.ok(brand);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Optional<Brand>> deleteBrandById(@PathVariable int id) {
        Optional<Brand> brand = brandService.getBrandById(id);
        brand.ifPresent(value -> brandService.deleteBrand(value.getId()));
        return ResponseEntity.ok(brand);
    }

    @PostMapping
    public ResponseEntity<Object> addBrand(@RequestBody Brand brand) {
        Brand savedBrand = brandService.save(brand);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedBrand.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
