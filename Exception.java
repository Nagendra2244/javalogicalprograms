/*
Write a Java program that takes input from the user in the form of a string and checks whether it is a palindrome or not. Your program should use exception handling to handle the following situations:If the user inputs a non-string value, the program should catch the exception and display an error message to the user.
  */

import java.util.Scanner;

public class EXception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          String name;
      System.out.print("Enter a string: ");
      name sc= scanner.nextLine();
      try {
          if (isPalindrome(input)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid string.");
        }
    }

    public static boolean isPalindrome(String input) {
        String reversedInput = new StringBuilder(input).reverse().toString();
        return input.equals(reversedInput);
    }
}
