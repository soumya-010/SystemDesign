package ChainOfResponsilibity_DesignPattern.ATM;

public class OneHundredRupee_Handler extends WithdrawalHandler{
    public OneHundredRupee_Handler(Currency currency, WithdrawalHandler nextCurrencyHandler) {
        super(currency, nextCurrencyHandler);
    }

    @Override
    public int dispense(int amount, Currency currency) {
        int n = amount / currency.getValue();
        int rem = amount % currency.getValue();
        System.out.println("Dispensing 100 Rupee Notes: " + n + " notes of Denomination " + currency.name() + " Total Amount Dispensed =  " + n * currency.getValue());
        return rem;
    }
}
