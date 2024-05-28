interface PaymentStrategy {
    public void pay(); //Each PaymentStrategy will have its own implementation of pay()
}

class PayPal implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying with PayPal");
    }
}
class CreditCard implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying with Credit Card");
    }
}

class UPI implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paying with UPI");
    }
}

class ShoppingCart {
    int totalPrice;
    PaymentStrategy payment;

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void setPaymentStrategy(PaymentStrategy payStrategy) {
        this.payment = payStrategy;
    }
    public void pay() {
        payment.pay();
    }
}

public class StrategyPattern {
    public static void main(String args[]) {
        ShoppingCart cart = new ShoppingCart();
        cart.setTotalPrice(699);
        CreditCard StandardChartered = new CreditCard();
        cart.setPaymentStrategy(StandardChartered);
            cart.pay(); // Paying with Credit Card

        PayPal username = new PayPal();
        cart.setPaymentStrategy(username);
            cart.pay(); // Paying with Credit Card

        UPI upiId = new UPI();
        cart.setPaymentStrategy(upiId);
            cart.pay(); // Paying with UPI
    }
}
