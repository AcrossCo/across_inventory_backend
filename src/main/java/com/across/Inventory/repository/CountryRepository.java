package com.across.inventory.repository;

import com.across.inventory.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sandun Rajitha
 */
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
