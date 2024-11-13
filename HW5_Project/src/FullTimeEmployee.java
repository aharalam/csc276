public class FullTimeEmployee extends Employee {
    private static final double FIXED_SALARY = 10000; // Fixed monthly salary

    // A constructor to initialize the employee's name and SSN
    public FullTimeEmployee(String name, String SSN) {
        super(name, SSN);
    }

    // Override the calculatePay() method to return the employee's fixed salary.
    @Override
    public double calculatePay() {
        return FIXED_SALARY;
    }

    // Override the displayInfo() method to return the employee's name and calculate their pay.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" (Full-Time Employee) \n\t- Monthly Pay: $%.2f\n", calculatePay());
    }
}
