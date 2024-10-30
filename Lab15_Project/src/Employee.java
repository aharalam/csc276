public class Employee {
    protected String name;
    protected int id;

    public Employee() {
        name = "N/A";
        id = 0;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\nID: " + id);
    }

    public double calculatePay() {
        return 0.00;
    }
}
