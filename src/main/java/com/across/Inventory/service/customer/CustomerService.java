package com.across.inventory.service.customer;

import com.across.inventory.model.Customer;

import java.util.List;
import java.util.Optional;

/**
 * @author Sandun Rajitha
 */
public interface CustomerService {
    List<Customer> getCustomers();

    Customer save(Customer brand);

    Optional<Customer> getCustomerById(int id);

    public void deleteCustomer(int id);
}
