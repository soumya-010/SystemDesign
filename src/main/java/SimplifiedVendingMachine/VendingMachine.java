package SimplifiedVendingMachine;

import SimplifiedVendingMachine.States.IdleState;
import SimplifiedVendingMachine.States.State;
import SimplifiedVendingMachine.VMInventory.Inventory;
import SimplifiedVendingMachine.VMInventory.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State state;
    private Inventory inventory;
    private List<Coin> coinList;

    public int MAX_CAPACITY;

    public VendingMachine() {
        //System.out.println("Calling VM Constructor START");
        this.state = new IdleState();
        this.MAX_CAPACITY = 20;
        this.inventory = new Inventory(MAX_CAPACITY);
        this.coinList = new ArrayList<>();
        //System.out.println("Calling VM Constructor END");
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void addProductToInventory(Product product) {
        Product[] inventoryProducts = inventory.getProducts();
        int currItemCount = inventory.getItemCount();
        if(currItemCount < MAX_CAPACITY) {
            inventoryProducts[currItemCount] = product;
            inventory.setItemCount(currItemCount+1);
        }
    }

    public Product getProductFromInventory(int productCode) {
        Product[] inventoryProducts = inventory.getProducts();
        //Get Product with ProductCode from Array of products
        for(Product sample: inventoryProducts) {
            if (sample.getProductCode() == productCode) {
                return sample;
            }
        }
        return null;
    }

    public void removeProductFromInventory(int productCode) {
        Product[] inventoryProducts = inventory.getProducts();
        int currItemCount = inventory.getItemCount();
        if(currItemCount > 0) {
            for (int i=0; i<currItemCount; i++) {
                Product sample = inventoryProducts[i];
                if (sample.getProductCode() == productCode) {
                    for (int j = i+1; j<currItemCount; j++) {
                        inventoryProducts[j-1] = inventoryProducts[j];
                    }
                }
            }
        }
        inventory.setItemCount(inventory.getItemCount()-1);
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public void display() {
        System.out.println("Calling IdleState::Display");
    }
}
