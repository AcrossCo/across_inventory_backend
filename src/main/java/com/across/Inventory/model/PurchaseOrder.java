package com.across.Inventory.model;


import jakarta.persistence.*;
import java.sql.Timestamp;

/**
 * PO model
 * Author ravindra@jp-across.com
 */
@Entity
public class PurchaseOrder {

    public PurchaseOrder() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Supplier_ID;
    private Timestamp Created_Date;
    private int Created_User_ID;
    private Timestamp cancelled_date;
    private String Cancelled_remark;
    private int Cancelled_User_ID;
    private Timestamp Completed_Date;
    private  String Completed_Remark;
    private int Completed_User_ID;

    public int getSupplier_ID() {
        return Supplier_ID;
    }

    public void setSupplier_ID(int supplier_ID) {
        Supplier_ID = supplier_ID;
    }

    public Timestamp getCreated_Date() {
        return Created_Date;
    }

    public void setCreated_Date(Timestamp created_Date) {
        Created_Date = created_Date;
    }

    public int getCreated_User_ID() {
        return Created_User_ID;
    }

    public void setCreated_User_ID(int created_User_ID) {
        Created_User_ID = created_User_ID;
    }

    public Timestamp getCancelled_date() {
        return cancelled_date;
    }

    public void setCancelled_date(Timestamp cancelled_date) {
        this.cancelled_date = cancelled_date;
    }

    public String getCancelled_Ramark() {
        return Cancelled_remark;
    }

    public void setCancelled_Ramark(String cancelled_remark) {
        Cancelled_remark = cancelled_remark;
    }

    public int getCancelled_User_ID() {
        return Cancelled_User_ID;
    }

    public void setCancelled_User_ID(int cancelled_User_ID) {
        Cancelled_User_ID = cancelled_User_ID;
    }

    public Timestamp getCompleted_Date() {
        return Completed_Date;
    }

    public void setCompleted_Date(Timestamp completed_Date) {
        Completed_Date = completed_Date;
    }

    public String getCompleted_Remark() {
        return Completed_Remark;
    }

    public void setCompleted_Remark(String completed_Remark) {
        Completed_Remark = completed_Remark;
    }

    public int getCompleted_User_ID() {
        return Completed_User_ID;
    }

    public void setCompleted_User_ID(int completed_User_ID) {
        Completed_User_ID = completed_User_ID;
    }




}
