/*
Write a program that simulates a bank account. The program should allow the user to deposit, withdraw, and check their balance. Handle any possible exceptions that may occur 
InputMismatchException: This exception may occur if the user enters an invalid input type while performing transactions, such as entering a string instead of a number.InsufficientFundsException: This exception may occur if the user tries to withdraw more money than their current balance.
FileNotFoundException: This exception may occur if there is an issue with accessing the file that stores the account information.
IOException: This exception may occur if there is an issue with input/output while reading or writing to the account file.
NumberFormatException: This exception may occur if the program tries to convert a string input to a numerical value, but the input is not a valid number.
NullPointerException: This exception may occur if the program tries to access an object that has not been initialized.
SecurityException: This exception may occur if the program tries to access a resource that it doesn't have permission to access.
  */




import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient Funds");
    }
}

public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance is " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance is " + balance);
    }

    public void checkBalance() {
        System.out.println("Your balance is " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nBank Account Menu\n");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear the input buffer
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("\nEnter amount to deposit: ");
                    try {
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // clear the input buffer
                    }
                    break;
                case 2:
                    System.out.print("\nEnter amount to withdraw: ");
                    try {
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // clear the input buffer
                    } catch (InsufficientFundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
