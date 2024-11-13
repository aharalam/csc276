public abstract class Employee {
    protected String name;
    protected String SSN;

    // A constructor to initialize the Employee's name and SSN
    public Employee(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
    }

    // An abstract method calculatePay() that will be implemented by
    // subclasses to define payment calculations for each employee type.
    public abstract double calculatePay();

    // A concrete method displayInfo() that prints the employee's names
    public void displayInfo() {
        System.out.print(name);
    }
}
