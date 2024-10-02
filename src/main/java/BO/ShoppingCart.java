package BO;

public class ShoppingCart {

    private int itemId;
    private String itemName;
    private final String userId;
    private int quantity;

    public ShoppingCart (int itemId, String itemName, int quantity, String userId) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.userId = userId;
    }

    public ShoppingCart () {
        this.itemId = -1;
        this.itemName = "";
        this.quantity = -1;
        this.userId = "";
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUserId() {
        return userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", userId='" + userId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
