package ChainOfResponsilibity_DesignPattern.ATM;

public class ATM_Design {
    public static void main(String[] args) {
        int amount = 723500;
        OneHundredRupee_Handler  oneHundredRupee_handler = new OneHundredRupee_Handler(Currency.HUNDRED, null);
        FiveHundredRupee_Handler fiveHundredRupee_handler = new FiveHundredRupee_Handler(Currency.FIVE_HUNDRED, oneHundredRupee_handler);
        OneThousandRupee_Handler oneThousandRupee_handler = new OneThousandRupee_Handler(Currency.ONE_THOUSAND, fiveHundredRupee_handler);
        TwoThousandRupee_Handler twoThousandRupee_handler = new TwoThousandRupee_Handler(Currency.TWO_THOUSAND, oneThousandRupee_handler);

        System.out.println("******************** Dispensing Change START********************");
        System.out.println("Total Amount = " + amount);
        if (amount % Currency.HUNDRED.getValue() != 0) {
            System.out.println("Cannot dispense change for total Amount as Notes not available in denominations less than 100");
        } else {
            twoThousandRupee_handler.handleWithdrawal(amount, Currency.TWO_THOUSAND);
        }
        System.out.println("******************** Dispensing Change END********************");
    }
}
