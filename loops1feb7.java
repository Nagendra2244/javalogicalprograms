/* write a java program to print the palindrome numberby using forloop Statements*/

import java.util.Scanner;
public class loops1feb7{
    public static void main(String[] args) {
      int num,reverse=0,temp,d;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num value:");
      num=sc.nextInt();
      temp=num;
      for(;0<num;){
        d=num%10;
        reverse=reverse*10+d;
        num=num/10;
         }
      if(temp==reverse){
        System.out.println("Given value is a palindrome number");
      }else{
        System.out.println("Given value is not a palindrome number");
      }
    }
}