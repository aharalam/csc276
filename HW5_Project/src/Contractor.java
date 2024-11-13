class Contractor extends Employee {
    private double weeklyRate;

    // Constructor
    public Contractor(String name, String SSN, double weeklyRate) {
        super(name, SSN);
        this.weeklyRate = weeklyRate;
    }

    // Override the calculatePay() method to return the Contractor's weekly rate.
    @Override
    public double calculatePay() {
        return weeklyRate;  // Weekly payment
    }

    // Override the displayInfo() method to display the employee's name, hourlyWage, hoursWorked, and their pay + seasonalBonus.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" (Contractor) \n\t- Weekly Payment: $%.2f\n\t- Pay: $%.2f\n", weeklyRate, calculatePay());
    }
}
