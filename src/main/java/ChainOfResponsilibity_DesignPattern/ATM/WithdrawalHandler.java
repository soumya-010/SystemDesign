package ChainOfResponsilibity_DesignPattern.ATM;

// An ATM has Notes of Rs. 2000, 1000, 500 and 100
// Given a user input (Amount), the ATM should dispense the amount as the sum of minimum number of notes.
// Additional Feature: If sufficient money is not available, it should not dispense anything

public abstract class WithdrawalHandler {
    private Currency currency;
    private WithdrawalHandler nextCurrencyHandler;

    public WithdrawalHandler(Currency currency, WithdrawalHandler nextCurrencyHandler) {
        this.currency = currency;
        this.nextCurrencyHandler = nextCurrencyHandler;
    }

    public void handleWithdrawal(int amount, Currency currency) {
        if(this.currency == currency && amount >= this.currency.getValue()) {
            int rem = dispense(amount, currency);
            if(this.nextCurrencyHandler != null) {
                this.nextCurrencyHandler.handleWithdrawal(rem, nextCurrencyHandler.currency);
            }
        } else {
            if(this.nextCurrencyHandler != null) {
                this.nextCurrencyHandler.handleWithdrawal(amount, nextCurrencyHandler.currency);
            } else if (amount < this.currency.getValue()){
                System.out.println("Cannot dispense change for amounts smaller than " + currency.name());
            }
        }
    }

    public abstract int dispense(int amount, Currency currency);
}
