package com.across.inventory.controller;

import com.across.inventory.model.Item;
import com.across.inventory.model.item.ItemActive;
import com.across.inventory.model.item.ItemWithDetail;
import com.across.inventory.requesthandler.ItemResource;
import com.across.inventory.service.item.ItemService;
import jakarta.validation.Valid;
import org.springdoc.api.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(path = "api/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> postItem(@Valid @RequestBody ItemResource item) {
        try {
            Item newitem = itemService.save(item);
            return new ResponseEntity<Item>(newitem, new HttpHeaders(), HttpStatus.CREATED);
        } catch (Exception ex){
           throw new RuntimeException(ex.getMessage());
        }

    }
    @GetMapping
    public ResponseEntity<List<ItemWithDetail>> getAll() {
        try {
            List<ItemWithDetail> allItems = itemService.getItems();
            if (allItems.isEmpty()) return new ResponseEntity<List<ItemWithDetail>>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
            return new ResponseEntity<List<ItemWithDetail>>(allItems, new HttpHeaders(), HttpStatus.FOUND);

        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }

    }

    @PatchMapping("/active")
    public ResponseEntity<Integer> activeInactiveItem (@RequestBody ItemActive item) {
        try {
            ItemActive iActive = itemService.activeInactiveItem(item);
            return new ResponseEntity<Integer>(iActive.getId(),new HttpHeaders(), HttpStatus.OK);

        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<Integer> updateItem ( @Valid @RequestBody ItemResource itemResource) {
        Item itemMaster = itemService.UpdateItem(itemResource);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



}
