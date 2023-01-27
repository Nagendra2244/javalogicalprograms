//Write a program that takes a user's input of a temperature in Celsius and prints the corresponding temperature in Fahrenheit. by using ifelse  condition
import java.util.Scanner;

public class Temperature2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double celsius;
        double fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius =sct.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        if (celsius < -273.15) {
            System.out.println("The temperature is less than absolute zero, it is not possible.");
        } else {
            System.out.println(celsius + " degrees Celsius is equivalent to " + fahrenheit + " degrees Fahrenheit.");
        }
    }
}