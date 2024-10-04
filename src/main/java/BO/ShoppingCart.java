package BO;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;
    private final String userId;

    public ShoppingCart(List<Item> items, String userId) {
        this.items = items;
        this.userId = userId;
    }

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
        this.userId = "";
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                ", userId='" + userId + '\'' +
                '}';
    }
}

