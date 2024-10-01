public class Bank {
    public static void main(String[] args) {
        // Create two BankAccount objects
        BankAccount bankAccount100 = new BankAccount(100, 1000);
        BankAccount bankAccount200 = new BankAccount(200, 1500);

        // Set the duration and interest to be constants: 2 and 0.03
        // (COMPLETED in the BankAccount class's constructors)

        // Set the account numbers (100 and 200) and balance (1000, 1500), respectively.
        // (COMPLETED THROUGH THE BankAccount(accountNum, bankBalance) CONSTRUCTOR)
        // However, we can also use:
        // bankAccount100.setAccountNum(100);
        // bankAccount200.setAccountNum(200);

        // Add $300 to account 100 and deduct $400 from account 200
        bankAccount100.updateBalance(300);
        bankAccount200.updateBalance(-400);

        // Suppose you have account 100 has 150 Swiss Franks, and account 200 has 140 Euros. Use the convertCur(double fAmout, double fEx) method to make your conversion and update your Balance.
        // Conversion rate from Swiss Franks to USD: 1.18
        // Conversion rate from Euros to USD: 1.11
        bankAccount100.updateBalance(BankAccount.convertCur(150, 1.18));
        bankAccount200.updateBalance(BankAccount.convertCur(140, 1.11));

        // Calculate the interest for the two BankAccounts
        bankAccount100.calcInterest();
        bankAccount200.calcInterest();

        // Display information for both accounts
        bankAccount100.displayAccount();
        System.out.println("\n"); // add a couple new line in between the two accounts
        bankAccount200.displayAccount();

        System.out.println(); // add a new line in between
    }
}
