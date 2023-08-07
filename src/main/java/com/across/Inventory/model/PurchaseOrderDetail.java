package com.across.inventory.model;

import jakarta.persistence.*;
import lombok.Data;


/**
 * PODetail model
 * Author ravindra@jp-across.com
 */
@Entity
@Data
public class PurchaseOrderDetail {

    public PurchaseOrderDetail() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PO_ID;
    private int Item_ID;
    private int Order_Qty;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "Id", nullable = false)
    private PurchaseOrder purchaseOrder;

}
