package SimplifiedVendingMachine.VMInventory;

public class Product {
    private Item item;
    private int productCode;
    private int qty;

    public Product(int productCode) {
        this.productCode = productCode;

    }
    public Product(Item item, int productCode, int qty) {
        this.item = item;
        this.productCode = productCode;
        this.qty = qty;
    }

    //Getters and Setters
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
        System.out.println("Setting product code" + this.getProductCode());
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
