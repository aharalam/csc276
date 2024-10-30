public class WeeklyEmployee extends Employee {
    private double WeeklySalary;

    public WeeklyEmployee(String name, int id, double weeklySalary) {
        //this.WeeklySalary = weeklySalary;
        super(name, id);
        this.WeeklySalary = weeklySalary;
    }

    @Override
    public double calculatePay() {
        return WeeklySalary;
    }
}
