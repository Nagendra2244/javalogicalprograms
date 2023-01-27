import java.util.Scanner;
public class first
  {
  public static vaoid main(String[] args)
    {
    int a;
    int b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the a value:");
    a=sc.nextInt();
    System.out.println("Enter the a value:");
    b=sc.nextInt();
    System.out.println("Before swapping");
    a=a+b;
    b=a-b;
    b=a-b;
    

    
    System.out.println("After swapping");
    System.out.println("print the value a :"+a);
     System.out.println("print the value b :"+b);
    }
  }