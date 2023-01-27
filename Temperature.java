// Write a program that takes a user's input of a temperature in Celsius and prints the corresponding temperature in Fahrenheit. 

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
       double celsius;
        double fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
         celsius =sc.nextDouble();
         fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " degrees Celsius is equivalent to " + fahrenheit + " degrees Fahrenheit.");
    }
}