// import the Scanner class
import java.util.Scanner;

// The Bank class is the only class in your program with the main() method.
public class Bank {
    // calculateSimpleInterest is a method that calculates the simple interest rate.
    // RETURN: double

    // The formula to calculate simple interest is:
    // I = Prt
    // I: total simple interest
    // P: principal amount (original balance)
    // r: annual interest rate
    // t: Loan term in years (duration)
    public static double calculateSimpleInterestRate(double principalAmount, double interestRate, int years) {
        return principalAmount * interestRate * years;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the bank of their choice:
        System.out.print("Enter the name of the bank of your choice: ");
        String nameOfBank = scanner.nextLine();

        // 1. Display meaningful instructions to ask user to enter the balance for the Checking account, the interest rate, the duration in years
        System.out.print("Enter the balance for the checking account: ");
        double checkingAccountBalance = scanner.nextDouble();

        System.out.print("Enter the interest rate for the checking account: ");
        double checkingAccountInterestRate = scanner.nextDouble();

        System.out.print("Enter the duration in years: ");
        int checkingAccountDurationInYears = scanner.nextInt();

        // (a) Calculate the simple interest for that duration
        double checkingAccountInterestEarned = calculateSimpleInterestRate(checkingAccountBalance, checkingAccountInterestRate, checkingAccountDurationInYears);

        // (b) Display the result of the enquiry meaningfully (Note: monetary values should display only two digits after the decimal point in all displays)
        System.out.printf("Simple interest for the checking account: %.2f%n", checkingAccountInterestRate);


        // 2. Display meaningful instructions to ask user to enter the balance for the Savings account, the interest rate, the duration in years and then to perform the following operations:
        System.out.print("\nEnter the balance for the savings account: ");
        double savingsAccountBalance = scanner.nextDouble();

        System.out.print("Enter the interest rate for the savings account as a decimal: ");
        double savingsAccountInterestRate = scanner.nextDouble();

        System.out.print("Enter the duration in years: ");
        int savingsAccountDurationInYears = scanner.nextInt();

        // (a) Calculate the simple interest for that duration
        double savingsAccountInterestEarned = calculateSimpleInterestRate(savingsAccountBalance, savingsAccountInterestRate, savingsAccountDurationInYears);

        // (b) Display the result of the enquiry meaningfully
        System.out.printf("The simple interest rate for the savings account: %.2f%n", savingsAccountInterestRate);

        // 3. Display a bank statement showing the name of the bank of your choice, the balances and the interest earned for each account meaningfully. Make sure the displays are well-formatted and look professional.
        // (a) It is recommended that you should use a Scanner object to read in user input and use System.out.print / println / printf to display and format the outputs.
        // (b) Please feel free to modify any program we coded in class.
        System.out.println("\n============== Bank Statement ==============");
        System.out.println("Bank: " + nameOfBank + "\n");
        System.out.printf("Checking Account Balance: $%.2f%n", checkingAccountBalance);
        System.out.printf("Checking Account Interest Earned: $%.2f%n", checkingAccountInterestEarned);
        System.out.printf("\nSavings Account Balance: $%.2f%n", savingsAccountBalance);
        System.out.printf("Savings Account Interest Earned: $%.2f%n", savingsAccountInterestEarned);

    } // main()
} // Main