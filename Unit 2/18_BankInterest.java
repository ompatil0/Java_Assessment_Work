// 18. A bank has a fixed interest rate that should not be changed once it is defined.
// Question:
// Create a class Bank with a final variable interestRate.
// Create a method calculateInterest(double amount) that calculates the interest using
// the fixed rate.
// Write a program to calculate interest for different customers.

class BankInterest {

    final double interestRate = 5.5;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }

    public static void main(String[] args) {

        BankInterest b = new BankInterest();

        System.out.println("Interest: " + b.calculateInterest(10000));
        System.out.println("Interest: " + b.calculateInterest(20000));
    }
}