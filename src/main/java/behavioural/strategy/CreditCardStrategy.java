package behavioural.strategy;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by michal on 16.02.17.
 */
public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private LocalDate expirationDate;

    public CreditCardStrategy(String name, String cardNumber, String cvv, LocalDate expirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}
