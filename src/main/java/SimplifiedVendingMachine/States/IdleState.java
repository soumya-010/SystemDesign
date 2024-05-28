package SimplifiedVendingMachine.States;

import SimplifiedVendingMachine.Coin;
import SimplifiedVendingMachine.VMInventory.Inventory;
import SimplifiedVendingMachine.VMInventory.Product;
import SimplifiedVendingMachine.VendingMachine;


import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    public IdleState() {
        //System.out.println("Entering IdleState with default constructor [no-arguments]");
    }

    public IdleState(VendingMachine machine) {
        //System.out.println("Entering IdleState with parameterized constructor [arguments: VendingMachine]");
        if (machine.getCoinList() == null) {
            machine.setCoinList(new ArrayList<>());
        }
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Inserting Coin of value = " + coin.value + " into Vending Machine in IdleState");
        List<Coin> coinList = machine.getCoinList();
        coinList.add(coin);
        machine.setState(new HasCoinState(machine));
    }

    @Override
    public void chooseProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Cannot choose product in IdleState");
    }

    @Override
    public void validateChosenProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Cannot validate ChosenProduct in HasCoinState");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Cannot dispense product in IdleState");
    }

    @Override
    public void dispenseChange(int amount) throws Exception {
        throw new Exception("Cannot dispense change in IdleState");
    }

    @Override
    public List<Coin> cancelAndRefund(VendingMachine machine) throws Exception {
        throw new Exception("Cannot Cancel product without selecting any product first - in IdleState");
    }

    @Override
    public void updateInventory(VendingMachine machine, Product product) throws Exception {
        machine.addProductToInventory(product);
    }
}
