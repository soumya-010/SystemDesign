package SimplifiedVendingMachine.States;

import SimplifiedVendingMachine.Coin;
import SimplifiedVendingMachine.VMInventory.Inventory;
import SimplifiedVendingMachine.VMInventory.Item;
import SimplifiedVendingMachine.VMInventory.Product;
import SimplifiedVendingMachine.VendingMachine;

import java.util.List;

public class DispensedState implements State {

    public DispensedState() {
        //System.out.println("Entering DispensedState with default constructor [no-arguments]");
    }
    public DispensedState(VendingMachine machine) {
        //System.out.println("Entering DispensedState with parameterized constructor [VendingMachine]");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cannot insertCoin in DispensedState");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Cannot chooseProduct in DispensedState");
    }

    @Override
    public void validateChosenProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Cannot validate ChosenProduct in DispensedState");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int productCode) throws Exception {
        Inventory inventory = machine.getInventory();

        Product product = inventory.getProduct(productCode);
        Item item = product.getItem();

        int totalCoins = 0;
        List<Coin> coins = machine.getCoinList();

        for(Coin coin : coins) {
            totalCoins += coin.value;
        }

        System.out.println("Dispensing Item: " + item.getType() + " from DispensedState");
        updateInventory(machine, product);

        dispenseChange(totalCoins - item.getPrice());
        if(totalCoins - item.getPrice() > 0)
            machine.setState(new HasCoinState(machine));
        else
            machine.setState(new IdleState(machine));
    }

    @Override
    public void dispenseChange(int amount) throws Exception {
        System.out.println("Dispensing Change for amount = " + amount);
    }

    @Override
    public List<Coin> cancelAndRefund(VendingMachine machine) throws Exception {
        throw new Exception("Cannot cancelAndRefund in DispensedState");
    }

    @Override
    public void updateInventory(VendingMachine machine, Product product) throws Exception {
        System.out.println("Removing 1 Unit of Product" + product.getItem().getType().toString());
        machine.removeProductFromInventory(product.getProductCode());
    }
}
