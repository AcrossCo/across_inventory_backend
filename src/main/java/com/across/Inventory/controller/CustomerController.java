package com.across.inventory.controller;

import com.across.inventory.model.Customer;
import com.across.inventory.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
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
@RequestMapping(path = "/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers() {
        List<Customer> customers = customerService.getCustomers();
        return ResponseEntity.ok(customers);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable int id) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Optional<Customer>> deleteCustomerById(@PathVariable int id) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        customer.ifPresent(value -> customerService.deleteCustomer(value.getId()));
        return ResponseEntity.ok(customer);
    }

    @PostMapping
    public ResponseEntity<Object> addCustomer(@RequestBody Customer brand) {
        Customer savedCustomer = customerService.save(brand);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedCustomer.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
