// Write a program that takes three integers as input and checks if they are all equal using else if statements.

import java.util.Scanner;

public class Homework2
  {
  public static void main(String[] args)
    {
       int num1;
       int num2;
      int num3;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    num1 = sc.nextInt();
    System.out.print("Enter second integer: ");
    num2 = sc.nextInt();
    System.out.print("Enter third integer: ");
    num3 = sc.nextInt();

    if (num1 == num2 && num2 == num3)
    {
      System.out.println("All integers are equal");
    } 
    else if (num1 != num2 || num2 != num3 || num1 != num3)
    {
      System.out.println("All integers are not equal");
    }
  }
}