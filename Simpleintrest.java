//calculate simple interst by using data types
import java.util.Scanner;
public class Simpleintrest
{
    public static void main(String args[]) 
    {
        float p,r;
          int t;
        float si;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextInt();
        si = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + si);
      System.out.print("The total amount : " + (si+p));
    }
}
