// print the big value in taking 2 numbers by using data types
import java.util.Scanner;
public class Second 
{
  public static void main(String[] args) 
  {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value:");
    a=sc.nextInt();
    System.out.println("Enter the value:");
    b=sc.nextInt();
    if(a > b) {
    System.out.println("a is big");
    }
    else {
     System.out.println("b is big");
    }
  }
}