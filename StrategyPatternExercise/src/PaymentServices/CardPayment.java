package PaymentServices;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("payed " + amount + " with Card");
    }
}
