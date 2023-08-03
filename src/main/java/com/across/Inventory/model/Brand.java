package com.across.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Sandun Rajitha
 */
@Entity
@Data
public class Brand {
    @Id
    private int id;
    private String name;

    public Brand() {}
}
