package com.across.inventory.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * PO model
 * Author ravindra@jp-across.com
 */
@Entity
@Data
public class PurchaseOrder {

    public PurchaseOrder() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private int supplier_id;
    private Timestamp created_date;
    private int created_user_id;
    private Timestamp cancelled_date;
    private String Cancelled_remark;
    private Integer cancelled_user_id;
    private Timestamp completed_date;
    private  String completed_remark;
    private Integer completed_user_id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "purchaseOrder")
    private Set<PurchaseOrderDetail> podetail = new HashSet<PurchaseOrderDetail>(0);
    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }

    public int getCreated_user_id() {
        return created_user_id;
    }

    public void setCreated_user_id(int created_user_id) {
        this.created_user_id = created_user_id;
    }

    public Timestamp getCancelled_date() {
        return cancelled_date;
    }

    public void setCancelled_date(Timestamp cancelled_date) {
        this.cancelled_date = cancelled_date;
    }

    public String getCancelled_remark() {
        return Cancelled_remark;
    }

    public void setCancelled_remark(String cancelled_remark) {
        Cancelled_remark = cancelled_remark;
    }

    public Integer getCancelled_user_id() {
        return cancelled_user_id;
    }

    public void setCancelled_user_id(Integer cancelled_user_id) {
        this.cancelled_user_id = cancelled_user_id;
    }

    public Timestamp getCompleted_date() {
        return completed_date;
    }

    public void setCompleted_date(Timestamp completed_date) {
        this.completed_date = completed_date;
    }

    public String getCompleted_remark() {
        return completed_remark;
    }

    public void setCompleted_remark(String completed_remark) {
        this.completed_remark = completed_remark;
    }

    public Integer getCompleted_user_id() {
        return completed_user_id;
    }

    public void setCompleted_user_id(Integer completed_user_id) {
        this.completed_user_id = completed_user_id;
    }

    public Set<PurchaseOrderDetail> getPodetail() {
        return podetail;
    }

    public void setPodetail(Set<PurchaseOrderDetail> podetail) {
        this.podetail = podetail;
    }





}
