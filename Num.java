// print given number even or odd by using switch case 
import java.util.Scanner;

public class Num
{
  public static void main(String[] args) 
  {

int num;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the num:");
  num =sc.nextInt();

switch (num % 2) 
{
    case 0:
        System.out.println(num + " is even");
        break;
    case 1:
        System.out.println(num + " is odd");
        break;
    default:
        System.out.println("Invalid input");
}
  }
}