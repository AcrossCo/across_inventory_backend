package com.across.inventory.repository;

import com.across.inventory.model.Item;
import com.across.inventory.requesthandler.ItemResource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Item repository
 * @author ravindra@jp-across.com
 * 2023-08-07
 * */
public interface ItemRepository extends JpaRepository<Item, Integer> {

//    public  Boolean existsByCodeOrName(String code, String name);
}
