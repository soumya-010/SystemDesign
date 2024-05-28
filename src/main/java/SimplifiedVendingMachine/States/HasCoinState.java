package SimplifiedVendingMachine.States;

import SimplifiedVendingMachine.Coin;
import SimplifiedVendingMachine.VMInventory.Inventory;
import SimplifiedVendingMachine.VMInventory.Product;
import SimplifiedVendingMachine.VendingMachine;

import java.util.List;

public class HasCoinState implements State{

    public HasCoinState() {
        //System.out.println("Entering HasCoinState with default constructor [no-arguments]");
    }

    public HasCoinState(VendingMachine machine) {
        //System.out.println("Entering HasCoinState with parameterized constructor [arguments: VendingMachine]");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Inserting Coin of value = " + coin.value + "into Vending Machine in HasCoinState");
        List<Coin> coinList = machine.getCoinList();
        coinList.add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int productCode) throws Exception {
          machine.setState(new SelectedState());
    }

    @Override
    public void validateChosenProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Cannot validate ChosenProduct in HasCoinState");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Cannot dispense change in HasCoinState");
    }

    @Override
    public void dispenseChange(int amount) throws Exception {
        throw new Exception("Cannot dispense change in HasCoinState");
    }

    @Override
    public List<Coin> cancelAndRefund(VendingMachine machine) throws Exception {
        throw new Exception("Cannot cancelAndRefund in HasCoinState");
    }

    @Override
    public void updateInventory(VendingMachine machine, Product product) throws Exception {
        throw new Exception("Cannot updateInventory in HasCoinState");
    }
}
