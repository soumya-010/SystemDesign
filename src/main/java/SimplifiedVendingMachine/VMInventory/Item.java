package SimplifiedVendingMachine.VMInventory;

public class Item {
    private ItemType type;
    private int price;

    public Item() {
        this.type = null;
        this.price = 0;
    }

    public Item(ItemType type, int price) {
        this.type = type;
        this.price = price;
    }

    //Getters and Setters
    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
