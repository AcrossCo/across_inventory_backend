package com.across.Inventory.repository;

import com.across.Inventory.model.PurchaseOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PO repository
 * Author ravindra@jp-across.com
 */
@Repository
public interface PurchaseOrderRepository {

    List<PurchaseOrder> list();

    //CRUD
    PurchaseOrder create(PurchaseOrder purchaseOrder);

    PurchaseOrder get(int id);

    PurchaseOrder update(int id, PurchaseOrder purchaseOrder);

    PurchaseOrder delete(int id);

}
