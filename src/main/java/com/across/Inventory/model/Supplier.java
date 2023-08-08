package com.across.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Sandun Rajitha
 */
@Entity
@Data
public class Supplier {
    @Id
    private int id;
    private String name;
    private String contact_no;
    private String email;
}
