/* Fibonacci Series  for N Terms
 
                n=8
 
    0   1   1   2   3   5   8   13   */
import java.util.Scanner;
public class loops1feb6{
  public static void main(String[] args){
    int i;
    int num;
    int num1=0;
    int num2=1;
    int num3=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value:");
    num=sc.nextInt();
   for ( i = 1;i <= num;i++) 
   {
     System.out.println(num1);
      num3 = num1+num2;
      num1=num2;
      num2=num3;
   } 
  } 
}