package com.across.inventory.service.supplier.impl;

import com.across.inventory.model.Supplier;
import com.across.inventory.repository.SupplierRepository;
import com.across.inventory.service.supplier.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */
@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> getSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Optional<Supplier> getSupplierById(int id) {
        return supplierRepository.findById(id);
    }

    @Override
    public void deleteSupplier(int id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
}
