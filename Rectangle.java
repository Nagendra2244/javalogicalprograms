// print the area of rectangle value by using a method with no arguments and with no retun value.
import java.util.Scanner;

class  Inputs {
   
  int area;
  float perimeter;
  void area(int l,int w) 
  {
     area= l*w;
     System.out.println("print the area of rectangle value:"+area);
  
  }
  void perimeter(int l,int w) 
  {
    perimeter=2*(l+W);
    System.out.println("print the area of rectangle value:"+perimeter);
  }
}
class Rectanglei
  {
  public static void main(String args[])
    {
      int l,w;
     Inputs  a1=new Inputs();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length value:");
     l=sc.nextInt();
    System.out.println("enter the width value:");
     w=sc.nextInt();
      a1.area(l,w);
      a1.perimeter(l,w);
    }
  }