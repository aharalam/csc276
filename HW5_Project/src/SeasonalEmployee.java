class SeasonalEmployee extends PartTimeEmployee {
    protected String season;
    protected static final double SEASONAL_BONUS = 200;  // Seasonal bonus

    // A constructor to initialize the PartTimeEmployee's name, SSN, hourlyRate, hoursWorked, and season.
    public SeasonalEmployee(String name, String SSN, double hourlyRate, int hoursWorked, String season) {
        super(name, SSN, hourlyRate, hoursWorked);
        this.season = season;
    }

    // Override the calculatePay() method to return the SeasonalEmployee's pay.
    @Override
    public double calculatePay() {
        return super.calculatePay() + SEASONAL_BONUS;
    }

    // Override the displayInfo() method to display the employee's name and their pay.
    @Override
    public void displayInfo() {
        System.out.printf("%s (Seasonal Employee - %s)\n\t- Hourly Wage: $%.2f, Hours Worked: %d, Seasonal Bonus: $%.2f\n\t- Pay: $%.2f\n", name, season, hourlyRate, hoursWorked, SEASONAL_BONUS, calculatePay());
    }
}
