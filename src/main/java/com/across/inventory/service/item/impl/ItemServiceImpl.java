package com.across.inventory.service.item.impl;

import com.across.inventory.handler.exception.RecordNotFoundException;
import com.across.inventory.model.Brand;
import com.across.inventory.model.Item;
import com.across.inventory.model.item.ItemActive;
import com.across.inventory.model.item.ItemWithDetail;
import com.across.inventory.repository.BrandRepository;
import com.across.inventory.repository.ItemRepository;
import com.across.inventory.requesthandler.ItemResource;
import com.across.inventory.service.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ravindra@jp-across.com
 * 2023-08-07
 * */
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final BrandRepository brandRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository _itemRepository, BrandRepository brandRepository) {
        this.itemRepository = _itemRepository;
        this.brandRepository = brandRepository;
    }

    @Override
    public Item save(ItemResource itemResource) {

        Item item = new Item();
        item.setSub_category_id(itemResource.getSub_category_id());
        item.setSku(itemResource.getSku());
        item.setName(itemResource.getName());
        item.setName_jp(itemResource.getName_jp());
        item.setJan(itemResource.getJan());
        item.setBrand_id(itemResource.getBrand_id());
        item.setMeasure_unit_id(itemResource.getMeasure_unit_id());
        item.setRol(itemResource.getRol());
        item.setMoq(itemResource.getMoq());
        item.setSelling_price(itemResource.getSelling_price());
        item.setCreated_user_id(1);
        item.setLast_modified_user_id(1);
        item.setActive(true);

        return itemRepository.save(item);
    }

    @Override
    public List<ItemWithDetail> getItems() {
        List<Item> itemList = itemRepository.findAll();
        if (itemList.size()>0) {
            List<ItemWithDetail> allItems = new ArrayList<>();
            for (Item item:itemList) {
                ItemWithDetail itemWithDetail = new ItemWithDetail();
                itemWithDetail.setName(item.getName());
                itemWithDetail.setNameJapanese(item.getName_jp());
                itemWithDetail.setSku(item.getSku());
                itemWithDetail.setJanCode(item.getJan());

                Brand brand = brandRepository.findById(item.getBrand_id()).get();
                itemWithDetail.setBrand(brand.getName());
                itemWithDetail.setSubCategory("cream");
                itemWithDetail.setUnit("Pcs");
                itemWithDetail.setMarketPrice(item.getSelling_price());
                itemWithDetail.setActive(item.isActive());

                allItems.add(itemWithDetail);
            }
            return allItems;
        } else {
            return null;
        }
    }

    @Override
    public ItemActive activeInactiveItem(ItemActive itemUpdate) {
        if (itemRepository.existsById(itemUpdate.getId())){
            throw new RecordNotFoundException("Item Id");
        }

        Item item = itemRepository.getReferenceById(itemUpdate.getId());
        item.setActive(itemUpdate.isActive());
        Timestamp timestamp = new Timestamp(new Date().getTime());
        item.setLast_modified_date(timestamp);
        Item aItem = itemRepository.save(item);
        return itemUpdate;
    }

    @Override
    public Item UpdateItem(ItemResource itemResource) {
        if (!itemRepository.existsById(itemResource.getId())) {
            throw new RecordNotFoundException("Item Id");
        }

        Item item = itemRepository.getReferenceById(itemResource.getId());

        item.setName(itemResource.getName());
        item.setName_jp(itemResource.getName_jp());
        item.setActive(itemResource.isActive());
        item.setMoq(itemResource.getMoq());
        item.setJan(itemResource.getJan());
        item.setRol(itemResource.getRol());
        item.setBrand_id(itemResource.getBrand_id());
        item.setMeasure_unit_id(itemResource.getMeasure_unit_id());
        item.setRol(itemResource.getRol());
        item.setSelling_price(itemResource.getSelling_price());
        item.setActive(itemResource.isActive());

        return itemRepository.save(item);
    }
}
