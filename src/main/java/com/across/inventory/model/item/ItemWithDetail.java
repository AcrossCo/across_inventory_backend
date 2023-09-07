package com.across.inventory.model.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

/**
 * @Author ravindra
 * get all item list with all details
 * 2023-08-10
 *
 */
@Entity
@Data

public class ItemWithDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String nameJapanese;
    private String sku;
    private String janCode;
    private String subCategory;
    private String brand;
    private String unit;
    private int rol;
    private long marketPrice;
    private long sellingPrice;
    private Date lastModifyDate;
    private boolean active;

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameJapanese(String nameJapanese) {
        this.nameJapanese = nameJapanese;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setJanCode(String janCode) {
        this.janCode = janCode;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public void setMarketPrice(long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setSellingPrice(long sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}
