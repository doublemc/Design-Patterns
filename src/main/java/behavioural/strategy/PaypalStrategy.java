package behavioural.strategy;

import java.math.BigDecimal;

/**
 * Created by michal on 16.02.17.
 */
class PaypalStrategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
