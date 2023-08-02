package com.across.Inventory.controller;


import com.across.Inventory.model.PurchaseOrder;

import com.across.Inventory.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * PO controller
 * Author ravindra@jp-across.com
 */
@RestController
@RequestMapping("/api")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    public PurchaseOrderController() {
    }

    /**
     * HTTP method GET
     * return orders
     */
    @GetMapping("/purchaseorders")
    public ResponseEntity<List<PurchaseOrder>> list() {
        List<PurchaseOrder> orders = purchaseOrderService.getPurchaseOrders();
        return ResponseEntity.ok(orders);
    }

    /**
     * HTTP method POST
     * return
     */
    @PostMapping("/purchaseorders")
    public PurchaseOrder addOrder(@RequestBody PurchaseOrder order) {

        return new PurchaseOrder();
    }

}
