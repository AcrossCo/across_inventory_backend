package com.across.inventory.service.supplier;

import com.across.inventory.model.Supplier;

import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */
public interface SupplierService {
    List<Supplier> getSuppliers();

    Optional<Supplier> getSupplierById(int id);

    void deleteSupplier(int id);

    Supplier save(Supplier supplier);
}
