package com.across.inventory.service.purchaseorder.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.across.inventory.model.PurchaseOrder;
import com.across.inventory.repository.PurchaseOrderRepository;
import com.across.inventory.service.PurchaseOrderService;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * PO service implimentation
 * Author ravindra@jp-across.com
 */
@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    private final PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    public PurchaseOrderServiceImpl(PurchaseOrderRepository _purchaseOrderRepository){
        this.purchaseOrderRepository = _purchaseOrderRepository;
    }

    /**
     * get all purchase orders
     * return purchaseOrderRepository.list
     */
    @Override
    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrderRepository.findAll();
    }

}
