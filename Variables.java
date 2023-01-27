// print the variables equal or not by using if else conditional statements
import java.util.Scanner;  

public class Variables
{  
public static void main(String[] args)   
{  
   int a,b,c;  
  Scanner sc = new Scanner(System.in);  
System.out.print("Enter a value: ");  
 a = sc.nextInt();  
  System.out.print("Enter b value: ");  
 b = sc.nextInt();  
  System.out.print("Enter c value: ");  
 c = sc.nextInt();  

if(a==b && b==c && c==a)  
{  
System.out.println("all variables are equal");  
}  

else  
{  
System.out.println("all variables are not equal.");  
 }  
 }
}