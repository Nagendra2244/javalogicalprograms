/*
Write a Java program that takes input from the user in the form of a string and checks whether it is a palindrome or not. Your program should use exception handling to handle the following situations:If the user inputs a non-string value, the program should catch the exception and display an error message to the user.
  */

import java.util.Scanner;

public class checkPalindrome {
    
        Scanner sc=new Scanner(System.in);
          String name;
        String st1;
       String reverse="";
    int i;
  void palindrome(){
      System.out.print("Enter a string Name:");
      st1=sc.nextLine();
      try {
          for(i=st1.length()-1;i>=0;i--){
         char ch=st1.charAt(i);
           reverse=reverse+ch;
    }
    if(st1.equalsIgnoreCase(reverse)){
      System.out.println("Given String is a palindrom");
    }else{
      System.out.println("Given string is a not a palindrom"); 
    }
      }
        } 
  catch (Exception ae) {
            System.out.println("Error occured enter a valid string.");
        }
    public static void main(String[] args) {
      checkPalindrome cp=new checkPalindrome();
          cp.palindrome();
  }

}
