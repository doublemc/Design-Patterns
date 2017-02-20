package behavioural.strategy;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by michal on 16.02.17.
 *
 * http://www.oodesign.com/strategy-pattern.html
 */
public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("Water", new BigDecimal(2));
        Item item2 = new Item("Bread", new BigDecimal(5));

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        PaymentStrategy paymentMethod = new PaypalStrategy("example", "password");
        // pay by paypal
        shoppingCart.pay(paymentMethod);

        paymentMethod = new CreditCardStrategy("example", "12345", "123", LocalDate.now());
        // pay by credit/debit card
        shoppingCart.pay(paymentMethod);
    }
}
