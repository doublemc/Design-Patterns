package behavioural.strategy;

import java.math.BigDecimal;

/**
 * Created by michal on 16.02.17.
 */
interface PaymentStrategy {
    void pay(BigDecimal amount);
}
