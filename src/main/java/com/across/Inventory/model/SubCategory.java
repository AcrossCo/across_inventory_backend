package com.across.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Sandun Rajitha
 */
@Entity(name = "sub_category")
@Data
public class SubCategory {
    @Id
    private int id;
    private String code;
    private String name;
}
