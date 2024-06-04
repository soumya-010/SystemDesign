package ChainOfResponsilibity_DesignPattern.ATM;

public enum Currency {
    HUNDRED (100),
    FIVE_HUNDRED (500),
    ONE_THOUSAND (1000),
    TWO_THOUSAND (2000);

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue () {
        return this.value;
    }
}
