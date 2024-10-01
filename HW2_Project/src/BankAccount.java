public class BankAccount {
    // Instance constant: INTEREST_RATE
    private final double INTEREST_RATE;

    // Instance variables: accountNum, bankBalance, duration, and interest
    private int accountNum; // In my opinion, accountNum should be a String because you never do arithmetic on bank account numbers.
    private double bankBalance;
    private final int DURATION; // time in years
    private double interest;

    // Default BankAccount constructor
    public BankAccount() {
        INTEREST_RATE = 0.03;

        accountNum = 0;
        bankBalance = 0.00;
        DURATION = 2;
        interest = 0.00;
    }

    // BankAccount constructor with 4 parameters
    public BankAccount(int accountNum, double bankBalance) {
        INTEREST_RATE = 0.03;

        this.accountNum = accountNum;
        this.bankBalance = bankBalance;
        DURATION = 2;
        this.interest = interest;
    }

    // Instance Methods: calcInterest(), updateBalance(), displayAccount(), getters, and setters with appropriate parameters if they need.
    public void calcInterest() {
        // Calculate the BankAccount's interest
        interest = bankBalance * INTEREST_RATE * DURATION;

        // Add the interest to the bank balance
        bankBalance += interest;
    }

    public void updateBalance() {
        calcInterest();
        bankBalance += interest;
    }

    public void displayAccount() {
        System.out.println("==== ACCOUNT NUMBER: " + accountNum + " ====");
        System.out.printf("Bank Balance: $%.2f\n", bankBalance);
        System.out.println("Duration: " + DURATION + " years");
        System.out.printf("Interest: %.2f", interest);
    }

    // Introduce a static method which is called convertCur(double fAmout, double fEx) for the user to make conversions their foreign currencies to US dollars
    // fAmout = foreign amount
    // fEx = foreign exchange rate
    public static double convertCur(double fAmout, double fEx) {
        return fAmout * fEx;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    // Methods not defined in the assignment but added here for simplicity:
    // updateBalance(): adds or subtracts money depending on whether the value is positive or negative.
    public void updateBalance(double balanceChange) {
        bankBalance += balanceChange;
    }

    // Not necessary because DURATION is a constant, but put here for practice.
    public int getDuration() {
        return DURATION;
    }

    // Not necessary because DURATION is a constant, but put here for practice.
    // You can't assign a value to a constant, either, so the below method will not work.
    /*public void setDuration(int DURATION) {
        this.DURATION = DURATION;
    }*/

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

}
