class PartTimeEmployee extends Employee {
    protected double hourlyRate;
    protected int hoursWorked;

    // A constructor to initialize the PartTimeEmployee's name, SSN, hourlyRate, and hoursWorked.
    public PartTimeEmployee(String name, String SSN, double hourlyRate, int hoursWorked) {
        super(name, SSN);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override the calculatePay() method to return the PartTimeEmployee's pay.
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;  // Hourly rate * hours worked
    }

    // Override the displayInfo() method to display the PartTimeEmployee's name, hourlyRate, hoursWorked, and pay.
    @Override
    public void displayInfo() {
        super.displayInfo();  // Display name using the superclass method
        System.out.printf(" (Part-Time Employee)\n\t- Hourly Wage: $%.2f, Hours Worked: %d\n\t- Pay: $%.2f\n", hourlyRate, hoursWorked, calculatePay());
    }
}
