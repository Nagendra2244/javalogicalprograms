// write a program that takes a users input of a year and prints wheather it is leap year or not by using if else statements.
import java.util.Scanner;
public class Leafyear
  {
   public static void main(String[] args)
    {
      int year;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an Year :: ");
      year = sc.nextInt();
      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
      {
         System.out.println(year+ "is a leap year");
      }
      else {
         System.out.println(year+ "is not a leap year");
      }
   }
}