package com.across.inventory.controller;

import com.across.inventory.model.Supplier;
import com.across.inventory.service.supplier.SupplierService;
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
@RequestMapping(path = "/api/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public ResponseEntity<List<Supplier>> getSuppliers() {
        List<Supplier> suppliers = supplierService.getSuppliers();
        return ResponseEntity.ok(suppliers);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Supplier>> getSupplierById(@PathVariable int id) {
        Optional<Supplier> supplier = supplierService.getSupplierById(id);
        return ResponseEntity.ok(supplier);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Optional<Supplier>> deleteSupplierById(@PathVariable int id) {
        Optional<Supplier> supplier = supplierService.getSupplierById(id);
        supplier.ifPresent(value -> supplierService.deleteSupplier(value.getId()));
        return ResponseEntity.ok(supplier);
    }

    @PostMapping
    public ResponseEntity<Object> addSupplier(@RequestBody Supplier supplier) {
        Supplier savedSupplier = supplierService.save(supplier);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedSupplier.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
