// product details and cost by using data types
import java.util.Scanner;
class report
  {
    public static vaoid main(Strings[] args)
     {
      int pno;
      float pcost;
      String pname;
      int pqty;
      System.out.println("enter product number:");
      pno= sc.nextInt();
      System.out.println("enter the product name:");
      pname= sc.next();
      System.out.println("Enter the product cost:");
      pcost= sc.nextFloat();
      System.out.println("enter product quantity:");
      pqty= sc.nextInt();
        
      System.out.println("print product number:"+pno);
      System.out.println("print product name:"+pname);
      System.out.println("print product cost:"+pcost);
      System.out.println("print product quantityr:"+pqty);
      System.out.println("print product Bill amount:"+(pcost*pqty));
      
      
    }
  }