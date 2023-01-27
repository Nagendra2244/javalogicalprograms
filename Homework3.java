// Write a program that takes three integers as input and checks if they are all equal using nested if statements.  

import java.util.Scanner;
public class Homework3
  {
    public static void main(String[] args)
    {
      int num1,num2,num3;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    num1 = sc.nextInt();
    System.out.print("Enter the second integer: ");
     num2 = sc.nextInt();
    System.out.print("Enter the third integer: ");
     num3 = sc.nextInt();
     
      if (num1 == num2)
      {
      if (num2 == num3) 
      {
        System.out.println("three integers are equal.");
      } 
      else 
      {
        System.out.println("three integers are not equal");
      }
    } 
      else
      {
      System.out.println("all entered values are different ");

    }
  }
  }