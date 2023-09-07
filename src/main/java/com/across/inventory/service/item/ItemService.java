package com.across.inventory.service.item;

import com.across.inventory.model.Item;
import com.across.inventory.model.item.ItemActive;
import com.across.inventory.model.item.ItemWithDetail;
import com.across.inventory.requesthandler.ItemResource;

import java.util.List;

/**
 * Item service
 * @author ravindra@jp-across.com
 * 2023-08-07
 * */
public interface ItemService {

    Item save(ItemResource item);
    List<ItemWithDetail> getItems();

    ItemActive activeInactiveItem(ItemActive item);

    public Item UpdateItem( ItemResource item);

}
