package com.across.inventory.requesthandler;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import jdk.jfr.BooleanFlag;
import org.springframework.validation.annotation.Validated;

import java.sql.Timestamp;

/**
 * @author ravindra
 * 2023/08/18
 *
 * */
@Validated

public class ItemResource {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "{common.code.not-null}")
    private int sub_category_id;

    @NotBlank(message = "{common.name.not-null}")
    private String sku;

    @NotBlank(message = "{Item Name Can't null}")
    private String name;

    @NotBlank(message = "{Item Japanese Name Can't null}")
    private String name_jp;

    @NotBlank(message = "Required")
    private String jan;//Japanese Article Numbering

    @NotNull(message = "Required")
    private int brand_id;

    @NotNull(message = "Required")
    private int measure_unit_id;

    @NotNull(message = "Required")
    @Min(0)
    private int rol;

    @NotNull(message = "Required")
    @Min(0)
    private int moq;

    @NotNull(message = "Required")
    @DecimalMin("0.00")
    private long selling_price;
    @NotNull(message = "Required")
    private int created_user_id;
    private Timestamp created_date;
    private Timestamp last_modified_date;
    private int last_modified_user_id;

    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getSub_category_id() {
        return sub_category_id;
    }

    public void setSub_category_id(int sub_category_id) {
        this.sub_category_id = sub_category_id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_jp() {
        return name_jp;
    }

    public void setName_jp(String name_jp) {
        this.name_jp = name_jp;
    }

    public String getJan() {
        return jan;
    }

    public void setJan(String jan) {
        this.jan = jan;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getMeasure_unit_id() {
        return measure_unit_id;
    }

    public void setMeasure_unit_id(int measure_unit_id) {
        this.measure_unit_id = measure_unit_id;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getMoq() {
        return moq;
    }

    public void setMoq(int moq) {
        this.moq = moq;
    }

    public long getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(long selling_price) {
        this.selling_price = selling_price;
    }

    public int getCreated_user_id() {
        return created_user_id;
    }

    public void setCreated_user_id(int created_user_id) {
        this.created_user_id = created_user_id;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }

    public Timestamp getLast_modified_date() {
        return last_modified_date;
    }

    public void setLast_modified_date(Timestamp last_modified_date) {
        this.last_modified_date = last_modified_date;
    }

    public int getLast_modified_user_id() {
        return last_modified_user_id;
    }

    public void setLast_modified_user_id(int last_modified_user_id) {
        this.last_modified_user_id = last_modified_user_id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }







}
