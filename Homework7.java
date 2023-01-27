// Write a program that takes a temperature as input and prints out whether it is above or below freezing, as well as whether it is above or below boiling, using nested if statements.

import java.util.Scanner;

public class Homework7
  {
    public static void main(String[] args)
  {
      Float temperature;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
         temperature = sc.nextFloat();

        if (temperature < 0) 
        {
            System.out.println("The temperature is below freezing.");
        } 
        else 
        {
            if (temperature > 100) 
            {
                System.out.println("The temperature is above boiling.");
            } 
            else 
            {
                System.out.println("The temperature is above freezing and below boiling.");
            }
        }
    }
}




