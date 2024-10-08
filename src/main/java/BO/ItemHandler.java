package BO;

import DB.ItemManager;
import DB.ShoppingCartManager;
import UIControllers.ItemInfo;

import java.util.ArrayList;
import java.util.List;

public class ItemHandler {

    public static List<ItemInfo> getItems() {
        List<Item> items = ItemManager.getItems();
        List<ItemInfo> itemInfos = new ArrayList<ItemInfo>();
        for (Item item : items) {
            itemInfos.add(new ItemInfo(item.getId(), item.getName(), item.getPrice(), item.getQuantity()));
        }
        return itemInfos;
    }

    public static List<ItemInfo> getShoppingCart(String userId) {
        List<Item> shoppingCart = ShoppingCartManager.getShoppingCart(userId);
        List<ItemInfo> shoppingCartInfos = new ArrayList<ItemInfo>();
        for (Item item : shoppingCart) {
            shoppingCartInfos.add(new ItemInfo(item.getId(), item.getName(), item.getPrice(), item.getQuantity()));
        }
        return shoppingCartInfos;
    }

    public static void addToCart(String userId, int itemId) {
        ShoppingCartManager.addShoppingCart(userId,itemId);
    }
}
