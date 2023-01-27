//print and calculate the simple interest by  using a method with no arguments and with no return value
import java.util.Scanner;

class Money{
        float p,r;
          int t;
        float si;
   Scanner sc=new Scanner(System.in);
  void rate() 
  {
      System.out.print("Enter the Principal : ");
        p =sc.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = sc.nextFloat();
        System.out.print("Enter the Time period : ");
        t = sc.nextInt();
        si = (r * t * p) / 100;
        System.out.println("The Simple Interest is : " + si);
       System.out.println("The total amount : " + (si+p));
    
  }
}
class intrest
  {
  public static void main(String args[])
    {
     
  Money m1=new Money();
      m1.rate();
    }
  }