package uk.co.taidev.projects.shop.basket.model;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private String id;
    private Map<String, Integer> items = new HashMap<>();

    public Basket() {
    }

    public Basket(String id) {
        this.id = id;
    }

    public void addItem(String itemId, int quantity) {
        //todo - check existing items?
        items.put(itemId, quantity);
    }

    public String getId() {
        return id;
    }

    public Map<String, Integer> getItems() {
        return items;
    }
}
