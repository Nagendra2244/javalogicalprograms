import java.util.Scanner;
public class ArthiExcept{
  Scanner sc=new Scanner(System.in);
  int a,b,c;
 void division(){
  try
  {
    System.out.println("Enter the a value:");
    a=sc.nextInt();
     System.out.println("Enter the a value:");
     b=sc.nextInt();
    c=a/b;
    System.out.println("The Division value:"+c);
  }
   catch(ArithmeticException ae)
    {
   System.out.println("The Exception Occure:");
    System.out.println("The Exception Occure:"+ae);
    System.out.println("The Exception Occure:"+ae.getMessage());
   }
}
  public static void main(String[] args){
    ArthException ae1=new ArthException();
     ae1.division();
  }

}