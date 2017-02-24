package structural.composite;

import java.math.BigDecimal;

/**
 * Created by michal on 24.02.17.
 */
interface Employee {
    void add(Employee employee);
    void remove(Employee employee);
    Employee getChild(int id);
    String getName();
    BigDecimal getSalary();
    void print();

}
