package com.across.inventory.repository;

import com.across.inventory.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sandun Rajitha
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
