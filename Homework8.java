// Write a program that takes a temperature as input and prints out whether it is above or below freezing, as well as whether it is above or below boiling, using else if statements.

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
          float temperature;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        temperature = sc.nextFloat();
        
        if (temperature < 0) 
        {
            System.out.println("The temperature is below freezing.");
        } 
        else if (temperature >= 0 && temperature <= 100) 
        {
            System.out.println("The temperature is above freezing and below boiling.");
        } 
        else 
        {
            System.out.println("The temperature is above boiling.");
        }
    }
}