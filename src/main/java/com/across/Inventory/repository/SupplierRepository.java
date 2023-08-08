package com.across.inventory.repository;

import com.across.inventory.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sandun Rajitha
 */
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
