package structural.composite;

import java.math.BigDecimal;

/**
 * Created by michal on 24.02.17.
 */
// leaf
class Developer implements Employee {
    private String name;
    private BigDecimal salary;

    public Developer(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        // method not applicable to this class because it's a leaf
    }

    @Override
    public void remove(Employee employee) {
        // method not applicable to this class because it's a leaf
    }

    @Override
    public Employee getChild(int id) {
        // method not applicable to this class because it's a leaf
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("==================");
        System.out.println("Developer's name: " + this.getName());
        System.out.println("Developer's salary: " + this.getSalary());
        System.out.println("===================");
    }
}
