//print the simple powerbill  .
import java.util.Scanner;
public class powerbill
  {
    public static void main(String[] args)
    {
      int cno,pmr,lmr,tu;
      String cname;
      double cbill;
    Scanner  sc= new Scanner(System.in);
      System.out.println("Enter the consumer number:");
      cno=sc.nextInt();
      System.out.println("Enter the consumer name:");
      cname=sc.next();
      System.out.println("Enter the present month reading :");
      pmr=sc.nextInt();
      System.out.println("Enter the last month reading:");
      lmr=sc.nextInt();
      tu=pmr-lmr;
      cbill=(tu*3.8);
      System.out.println("Print consumer number:"+cno);
      System.out.println("Print consumer name:"+cname);
      System.out.println("print present month reading:"+pmr);
      System.out.println("print the last month reading:"+lmr);
      System.out.println("print total units:"+tu);
      System.out.println("print current bill:"+cbill);
    }
  }
      
      
      
  