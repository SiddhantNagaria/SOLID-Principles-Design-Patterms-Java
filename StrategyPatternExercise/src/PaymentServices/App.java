package PaymentServices;

public class App {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new CardPayment());
        paymentService.pay(500.00);

        paymentService.setStrategy(new UpiPayment());
        paymentService.pay(200.00);
    }
}
