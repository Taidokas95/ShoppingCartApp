package UIControllers;

public class ItemInfo {

    private final int id;
    private String name;
    private int price;
    private int quantity;

    public ItemInfo(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ItemInfo(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public ItemInfo() {
        this.id = 0;
        this.name = "";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
