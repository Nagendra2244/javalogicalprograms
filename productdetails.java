//print the area of product details by using a method with no arguments and with no retun value.
import java.util.Scanner;

class Product {
      int pno;
      String pname;
     int pqty;
     float ptotal,pcost;
   Scanner sc=new Scanner(System.in);
  void details() 
  {
      System.out.print("Enter the product Number : ");
        pno =sc.nextInt();
        System.out.print("Enter the product name: ");
        pname = sc.next();
        System.out.print("Enter the product quantity : ");
         pqty = sc.nextInt();
        System.out.print("Enter the product cost: ");
         pcost = sc.nextFloat();
         ptotal=pcost*pqty;
       System.out.println("The Product Number : " + pno);
       System.out.println("The Product Name : " + pname);
       System.out.println("The Product to : " + ptotal);
       
    
  }
}
class productdetails
  {
  public static void main(String args[])
    {
     
  Product p1=new Product();
      p1.details();
    }
  }