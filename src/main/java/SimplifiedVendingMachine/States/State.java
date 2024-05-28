package SimplifiedVendingMachine.States;

import SimplifiedVendingMachine.Coin;
import SimplifiedVendingMachine.VMInventory.Product;
import SimplifiedVendingMachine.VendingMachine;


import java.util.List;

public interface State {
    public void insertCoin (VendingMachine machine, Coin coin) throws Exception;
    public void chooseProduct(VendingMachine machine, int productCode) throws Exception;
    public void validateChosenProduct(VendingMachine machine, int productCode) throws Exception;
    public void dispenseProduct(VendingMachine machine, int productCode) throws Exception;
    public void dispenseChange(int amount) throws Exception;
    public List<Coin> cancelAndRefund(VendingMachine machine) throws Exception;
    public void updateInventory(VendingMachine machine, Product product) throws Exception;
}
