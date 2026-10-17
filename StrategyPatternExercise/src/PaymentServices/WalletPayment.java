package PaymentServices;

public class WalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("payed " + amount + " with Wallet");
    }
}
