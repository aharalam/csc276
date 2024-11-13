import java.util.Arrays;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create a List of Employee objects using Arrays.asList()
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new FullTimeEmployee("Andrew Haralambous", "123-45-6789"),
                new PartTimeEmployee("Carter Brockman", "987-65-4321", 20, 25),
                new Contractor("Halil Bisgin", "555-55-5555", 5000),
                new SeasonalEmployee("Madelyn Moore", "111-22-3333", 15, 40, "Winter")
        ));

        // Iterate over the list and display info and pay for each employee
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}
