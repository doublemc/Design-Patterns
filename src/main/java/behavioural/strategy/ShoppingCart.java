package behavioural.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 16.02.17.
 */
class ShoppingCart {
    private List<Item> chosenItems;

    public ShoppingCart() {
        this.chosenItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        chosenItems.add(item);
    }

    public void removeItem(Item item) {
        chosenItems.remove(item);
    }

    public BigDecimal calculateTotal() {
        return chosenItems.stream()
                .map(Item::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void pay(PaymentStrategy paymentMethod) {
        BigDecimal amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
