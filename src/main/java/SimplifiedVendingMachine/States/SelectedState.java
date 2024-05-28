package SimplifiedVendingMachine.States;

import SimplifiedVendingMachine.Coin;
import SimplifiedVendingMachine.VMInventory.Inventory;
import SimplifiedVendingMachine.VMInventory.Item;
import SimplifiedVendingMachine.VMInventory.Product;
import SimplifiedVendingMachine.VendingMachine;

import java.util.List;

public class SelectedState implements State{

    public SelectedState() {
        System.out.println("Entering SelectedState with default constructor [no-arguments]");
    }

    public SelectedState(VendingMachine machine) {
        System.out.println("Entering SelectedState with parameterized constructor [VendingMachine]");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cannot insertCoin in SelectedState");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Cannot choose product in SelectedState");
    }

    @Override
    public void validateChosenProduct(VendingMachine machine, int productCode) throws Exception {
        Inventory inventory = machine.getInventory();
        if(inventory.getProduct(productCode) != null) {
            Product product = inventory.getProduct(productCode);
            Item item = product.getItem();

            int totalCoins = 0;
            List<Coin> coins = machine.getCoinList();

            for(Coin coin : coins) {
                totalCoins += coin.value;
            }

            if(item.getPrice() <= totalCoins) {
                machine.setState(new DispensedState(machine));
            }
            else
            {
                System.out.println("Not enough Coins to purchase this Item, available balance = " + totalCoins + " and Item Price = " + item.getPrice());
                List<Coin> refundCoins = cancelAndRefund(machine);
                for(Coin coin : refundCoins) {
                    System.out.println("Refunding coin = " + coin.value);
                }
                machine.setState(new IdleState(machine));
            }

        } else {
            machine.setState(new HasCoinState(machine));
            System.out.println("Product with code = " + productCode + " does not exist in the inventory");
        }
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Cannot dispenseProduct in SelectedState");
    }

    @Override
    public void dispenseChange(int amount) throws Exception {
        throw new Exception("Cannot dispenseChange in SelectedState");
    }

    @Override
    public List<Coin> cancelAndRefund(VendingMachine machine) throws Exception {
        System.out.println("Canceling Selected Product and Initiating Refund of Entire Balance");
        List<Coin> coins = machine.getCoinList();
        machine.setState(new IdleState(machine));
        return coins;
    }

    @Override
    public void updateInventory(VendingMachine machine, Product product) throws Exception {
        throw new Exception("Cannot update Inventory in SelectedState");
    }
}
