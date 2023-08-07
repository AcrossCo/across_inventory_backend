package com.across.inventory.repository;

import com.across.inventory.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Sandun Rajitha
 */
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
