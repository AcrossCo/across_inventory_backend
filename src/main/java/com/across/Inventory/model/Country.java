package com.across.inventory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

/**
 * @author Sandun Rajitha
 */

@Entity
@Data
public class Country {
    @Id
    @GeneratedValue
    private int id;
    private String iso;
    private String name;
    private String country_code;
    private int phonecode;

    @OneToMany
    @JsonIgnore
    private List<Customer> customers;

    protected Country() {
    }
}
