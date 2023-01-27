//to find the maximum value of given three numbers by using  if else statements.
import java.util.Scanner;
public class simple2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();

        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("The maximum number is: " + num1);
            } else {
                System.out.println("The maximum number is: " + num3);
            }
        } else {
            if (num2 >= num3) {
                System.out.println("The maximum number is: " + num2);
            } else {
                System.out.println("The maximum number is: " + num3);
            }
        }
    }
}
