// swapping by taking temp variable
import java.util.Scanner;
  public class swapping
{
    int a,b;
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
     a=sc.nextInt();
    System.out.println("Enter b number: ");
     b=sc.nextInt();
    System.out.println("Enter temp value: ");
  temp=sc.nextInt();
	

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
 
        a=a+b;
        b=a-b;
        a =a-b;
 
        System.out.println("After swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
  }
}

