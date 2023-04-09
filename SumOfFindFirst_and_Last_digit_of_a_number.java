/* Write a JAVAprogram to find sum of first and last digit of a number*/
import java.util.*;
public class SumOfFindFirst_and_Last_digit_of_a_number{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        int firstDigit = number;
        sum = firstDigit + lastDigit;
        System.out.println("The sum of first and last digit of " + number + " is " + sum);
    }
}