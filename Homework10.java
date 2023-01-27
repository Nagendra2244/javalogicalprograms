// Write to check given input is integer or character or special character using else if statements.

import java.util.Scanner;
public class Homework10
  {
    public static void main(String[] args) {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a character:");
      ch=sc.next().charAt(0);

      if(ch>='a' && ch <='z')
      {
        System.out.println("The input is a letter.");
    } 
      else if (ch>=0) 
      {
        System.out.println("The input is a digit.");
    }
      else 
      {
        System.out.println("The input is a special character.");
    }
}
  }
