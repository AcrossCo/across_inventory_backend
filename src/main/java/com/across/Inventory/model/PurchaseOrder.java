package com.across.Inventory.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

/**
 * PO model
 * Author ravindra@jp-across.com
 */
@Entity
//@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class PurchaseOrder {

    public PurchaseOrder() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Supplier_ID;
    private Timestamp Created_Date;
    private int Created_User_ID;
    private Timestamp Cancelled_Date;
    private String Cancelled_remark;
    private Integer Cancelled_User_ID;
    private Timestamp Completed_Date;
    private  String Completed_Remark;
    private Integer Completed_User_ID;

}
