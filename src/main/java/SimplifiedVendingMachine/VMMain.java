package SimplifiedVendingMachine;


import SimplifiedVendingMachine.States.State;
import SimplifiedVendingMachine.VMInventory.Inventory;
import SimplifiedVendingMachine.VMInventory.Item;
import SimplifiedVendingMachine.VMInventory.ItemType;
import SimplifiedVendingMachine.VMInventory.Product;

import java.util.List;


public class VMMain {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("| ************************ Filling Up Inventory ************************ |");

        fillUpInventory(vendingMachine);
        displayInventory(vendingMachine);

        System.out.println("| ************************ End of Init Inventory ************************ | \n \n");

        State vendingState = vendingMachine.getState();
        //System.out.println("Current State of Vending Machine: " + vendingState.getClass().getSimpleName());

        vendingState.insertCoin(vendingMachine, Coin.PENNY);
        vendingState.insertCoin(vendingMachine, Coin.NICKEL);
        vendingState.insertCoin(vendingMachine, Coin.QUARTER);
        vendingState.insertCoin(vendingMachine, Coin.QUARTER);
        vendingState.insertCoin(vendingMachine, Coin.QUARTER);
        vendingState.insertCoin(vendingMachine, Coin.DIME);
        vendingState.insertCoin(vendingMachine, Coin.DIME);

        System.out.println("\n \n | ************************ COIN BANK ************************ |");
        List<Coin> coinList = vendingMachine.getCoinList();
        for(Coin coin : coinList) {
            System.out.println(coin.name() + " " + coin.value);
        }

        vendingState = vendingMachine.getState();
        System.out.println("Current State of Vending Machine: " + vendingState.getClass().getSimpleName());

        System.out.println("| ************************ Filling Up Coin List END ************************ | \n \n");

        vendingState = vendingMachine.getState();
        System.out.println("\n | Clicking on Choose Product |");

        vendingState = DispenseProductFromVendingMachine(vendingMachine, vendingState, 101);
        vendingState = DispenseProductFromVendingMachine(vendingMachine, vendingState, 101);
        vendingState = DispenseProductFromVendingMachine(vendingMachine, vendingState, 101);
        vendingState = DispenseProductFromVendingMachine(vendingMachine, vendingState, 404);
        vendingState = DispenseProductFromVendingMachine(vendingMachine, vendingState, 202);
        vendingState = DispenseProductFromVendingMachine(vendingMachine, vendingState, 303);



        displayInventory(vendingMachine);
    }
    private static State DispenseProductFromVendingMachine(VendingMachine vendingMachine, State vendingState, int productCode) throws Exception {
        vendingState.chooseProduct(vendingMachine, productCode);
        vendingState = vendingMachine.getState();
        //System.out.println("Current State of Vending Machine: " + vendingState.getClass().getSimpleName());
        vendingState.validateChosenProduct(vendingMachine,productCode);
        vendingState = vendingMachine.getState();
        //System.out.println("Current State of Vending Machine: " + vendingState.getClass().getSimpleName());
        vendingState.dispenseProduct(vendingMachine,productCode);
        vendingState = vendingMachine.getState();
        return vendingState;
    }
    private static void fillUpInventory(VendingMachine vendingMachine) throws Exception {
        Inventory inventory = vendingMachine.getInventory();
        Product[] products = inventory.getProducts();
        // System.out.println(products.length);

        for (int idx = 0; idx < 20; idx++) {

            Item newItem = null;
            Product newProduct = null;

            if(idx <= 6) {
                //System.out.println("i=" + idx);
                newItem = new Item(ItemType.LAYS, 12);
                newProduct = new Product(101);
                //System.out.println(newItem.getType() + " " + newItem.getPrice());
            }
            else if(idx <= 10){
                //System.out.println("i=" + idx);
                newItem = new Item(ItemType.COKE, 9);
                newProduct = new Product(202);
                //System.out.println(newItem.getType() + " " + newItem.getPrice());
            }
            else if(idx<= 17){
                //System.out.println("i=" + idx);
                newItem = new Item(ItemType.PEPSI, 13);
                newProduct = new Product(303);
                //System.out.println(newItem.getType() + " " + newItem.getPrice());
            }
            else if(idx< vendingMachine.MAX_CAPACITY){
                //System.out.println("i=" + idx);
                newItem = new Item(ItemType.WATER, 5);
                newProduct = new Product(404);
                //System.out.println(newItem.getType() + " " + newItem.getPrice());
            }
            newProduct.setItem(newItem);
            newProduct.setQty(1);

            products[idx] = new Product(newProduct.getItem(), newProduct.getProductCode(), newProduct.getQty());
            //System.out.println(inventory.getItemCount());
            inventory.setItemCount(idx+1);
            //System.out.println(inventory.getItemCount());
        }
    }

    private static void displayInventory(VendingMachine vendingMachine){
        Inventory inventory = vendingMachine.getInventory();
        Product[] products = inventory.getProducts();
        System.out.println("| ************************ INVENTORY ************************ |");

        System.out.println(inventory.getItemCount());
        for (int i = 0; i < inventory.getItemCount(); i++) {
            System.out.println
            (
                    "ProductCode: " + products[i].getProductCode() +
                    " Item: "       + products[i].getItem().getType().toString() +
                    " Price: "      + products[i].getItem().getPrice()
            );
        }
    }
}


