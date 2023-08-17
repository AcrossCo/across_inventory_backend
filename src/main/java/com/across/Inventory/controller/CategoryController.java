package com.across.inventory.controller;

import com.across.inventory.model.Category;
import com.across.inventory.service.category.CategoryService;
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
@RequestMapping(path = "/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> categories = categoryService.getCategories();
        return ResponseEntity.ok(categories);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Category>> getCategoryById(@PathVariable int id) {
        Optional<Category> category = categoryService.getCategoryById(id);
        return ResponseEntity.ok(category);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Optional<Category>> deleteCategoryById(@PathVariable int id) {
        Optional<Category> category = categoryService.getCategoryById(id);
        category.ifPresent(value -> categoryService.deleteCategory(value.getId()));
        return ResponseEntity.ok(category);
    }

    @PostMapping
    public ResponseEntity<Object> addCategory(@RequestBody Category category) {
        Category savedCategory = categoryService.save(category);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedCategory.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
