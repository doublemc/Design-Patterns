package structural.composite;

import java.math.BigDecimal;

/**
 * Created by michal on 24.02.17.
 */
class CompositeMain {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Michał", new BigDecimal(25000));
        Employee dev2 = new Developer("Agatka", new BigDecimal(40000));
        Employee manager = new Manager("Robert", new BigDecimal(100000));

        manager.add(dev1);
        manager.add(dev2);

        Employee dev3 = new Developer("Grazyna", new BigDecimal(200000));
        Employee generalManager = new Manager("Arek", new BigDecimal(5000000));

        generalManager.add(dev3);
        generalManager.add(manager);
        generalManager.print();
    }
}
