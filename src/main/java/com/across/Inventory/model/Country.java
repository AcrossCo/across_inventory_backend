package com.across.inventory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Sandun Rajitha
 */

@Entity
@Data
public class Country {
    @Id
    private int id;
    private String name;

    protected Country() {
    }
}
