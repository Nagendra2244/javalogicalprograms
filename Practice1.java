// Write a program that takes a user's input of a number and checks if it is a Fibonacci number or not. Use an  to determine if the number is a Fibonacci number or not. 

import java.util.Scanner;
public class Practice1
  {
    public static void main(String args[])
    {
      int num;
      int a=0,b=1,c=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
       num=sc.nextInt();
      if(c < num) {
      c = a + b;
      a = b;
      b = c;
      }
      if(c == num)
      {
        System.out.println(num+" is Fibonacci number");
      } 
      else
      {
         System.out.println(num+" is Not Fibonacci number");
      }
        
      }
    }
  