package com.across.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Sandun Rajitha
 */
@Entity
@Data
public class Brand {
    @Id
//    @GeneratedValue
    private int id;
    private String name;

    protected Brand() {}
}
