package com.across.inventory.controller;


import com.across.inventory.model.PurchaseOrder;
import com.across.inventory.model.PurchaseOrderDetail;
import com.across.inventory.service.PurchaseOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * PO controller
 * Author ravindra@jp-across.com
 */
@Controller
@RequestMapping(path="/api/purchaseorder")
public class PurchaseOrderController {

    private final PurchaseOrderService purchaseOrderService;
    @Autowired
    public PurchaseOrderController(PurchaseOrderService _purchaseOrderService) {
        this.purchaseOrderService = _purchaseOrderService;
    }

    /**
     * HTTP method GET
     * return orders
     */
    @GetMapping
    public ResponseEntity<List<PurchaseOrder>> getPurchaseOrders() {
        List<PurchaseOrder> orders = purchaseOrderService.getPurchaseOrders();
        return ResponseEntity.ok(orders);
    }

    /**
     * HTTP method POST
     * return
     */
    @PostMapping
    public PurchaseOrder addOrder(@RequestBody PurchaseOrder order) {
        int id = order.getCreated_user_id();
        int supid = order.getSupplier_id();
        PurchaseOrder podfr = order;
        return new PurchaseOrder();
    }

}
