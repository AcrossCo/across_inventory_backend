package com.across.inventory.model.item;


import jakarta.persistence.*;
import lombok.Data;

/**
 * @Author ravindra
 * 2023-08-09
 *
 */
@Entity
@Data
@Table(name = "item")
public class ItemActive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "active")
    private boolean active;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
