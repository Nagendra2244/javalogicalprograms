/* write a java program to print the palindrom number or not*/
import java.util.Scanner;
public class loopsjan318 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, temp, reverse = 0, rem=0;

    System.out.print("Enter a number: ");
    num = sc.nextInt();
    temp = num;
   while (num != 0) {
      rem = num % 10;
      reverse=reverse * 10 +rem ;
      num=num/10;
    }
    if (temp == reverse) {
      System.out.println("given number is a palindrome number");
    } else {
      System.out.println("given number is a not palindrome number");
    }
  }
}



