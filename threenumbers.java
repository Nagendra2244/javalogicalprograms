// taking three numbers print the big number by conditional if else statements
import java.util.Scanner;
public class threenumbers
  {
   public static void main(String[] args)
    {
      int a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value :: ");
      a = sc.nextInt();
      System.out.println("Enter b value :: ");
      b = sc.nextInt();
      System.out.println("Enter c value :: ");
      c = sc.nextInt();
      
      if (a>b)
      { 
        if(a>c){
         System.out.println( "a is big");
        }
        else{
          System.out.println( "c is big");
        }
      }
      else {
        if(b>c){
         System.out.println("b is big");
        }
        else{
          System.out.println("c is big");
        }
      }
   }
}