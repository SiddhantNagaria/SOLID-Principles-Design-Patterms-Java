package PaymentServices;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount){
        this.paymentStrategy.pay(amount);
    }
}
