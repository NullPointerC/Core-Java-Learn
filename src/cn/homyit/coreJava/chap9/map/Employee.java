package cn.homyit.coreJava.chap9.map;

/**
 * A minimalist employee class for testing purposes.
 * @author Ziqiang CAO
 */
public class Employee {
    private String name;
    private double salary;

    /**
     * Constructs an employee with $0 salary.
     *
     * @param name the employee name
     */
    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    public String toString() {
        return "[name=" + name + ", salary=" + salary + "]";
    }
}
