package SimplifiedVendingMachine.VMInventory;

public class Inventory {
    private Product[] products;
    private int itemCount;

    public Inventory (int VMCapacity) {
        products = new Product[VMCapacity];

        itemCount = 0;
    }

    public void initProducts(int VMCapacity) {
        products = new Product[VMCapacity];
    }

    public void addProduct(Product product) {
        products[itemCount] = product;
        itemCount++;
    }

    public Product getProduct(int productCode) {
        //Get Product with ProductCode from Array of products
        for(Product sample: products) {
            if (sample.getProductCode() == productCode) {
                return sample;
            }
        }
        return null;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
