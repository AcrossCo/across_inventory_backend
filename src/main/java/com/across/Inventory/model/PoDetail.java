package com.across.inventory.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * PODetail model
 * Author ravindra@jp-across.com
 */
@Entity
@Data
public class PoDetail {

    public PoDetail() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PO_ID;
    private int Item_ID;
    private int OrderQty;
}
