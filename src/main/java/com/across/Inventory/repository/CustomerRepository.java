package com.across.inventory.repository;

import com.across.inventory.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sandun Rajitha
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
