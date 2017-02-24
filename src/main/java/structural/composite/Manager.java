package structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by michal on 24.02.17.
 */
// composite
class Manager implements Employee {
    private String name;
    private BigDecimal salary;
    private List<Employee> employees;

    public Manager(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
        employees = new ArrayList<>();
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int id) {
        return employees.get(id);
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
        System.out.println("---------------");
        System.out.println("Manager's name: " + this.getName());
        System.out.println("Manager's salary: " + this.getSalary());
        System.out.println("---------------");

        Iterator<Employee> employeeIter = employees.iterator();
        while (employeeIter.hasNext()) {
            Employee employee = employeeIter.next();
            employee.print();
        }
    }
}
