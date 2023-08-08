package com.across.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {

    public Customer() {
    }

    @Id
    private int id;

    private String code;

    private String name;

    private String email;

    @ManyToOne
    @JoinColumn(name = "Country_Id", nullable = false, referencedColumnName = "Id", foreignKey = @ForeignKey(name = "customer_country_fk"))
    private Country Country;

}