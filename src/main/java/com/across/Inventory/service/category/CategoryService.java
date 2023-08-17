package com.across.inventory.service.category;

import com.across.inventory.model.Category;

import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */
public interface CategoryService {
    List<Category> getCategories();

    Optional<Category> getCategoryById(int id);

    void deleteCategory(int id);

    Category save(Category brand);
}
