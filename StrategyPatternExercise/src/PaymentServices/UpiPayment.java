package PaymentServices;

public class UpiPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payed " + amount + " with UPI");
    }

}
