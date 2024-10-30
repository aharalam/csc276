public class Main {
    public static void main(String[] args) {
        WeeklyEmployee weeklyEmployee = new WeeklyEmployee("Bob", 1, 1000.50);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Andrew", 2, 50.25, 40);

        System.out.println("\n==== Weekly Employee ====");
        weeklyEmployee.displayDetails();
        System.out.printf("Weekly Pay: $%.2f", weeklyEmployee.calculatePay());
        System.out.println();

        System.out.println("\n==== Hourly Employee ====");
        hourlyEmployee.displayDetails();
        System.out.printf("Hourly Pay (%d hours): $%.2f%n", hourlyEmployee.getHoursWorked(), hourlyEmployee.calculatePay());
        System.out.println();
    }
}