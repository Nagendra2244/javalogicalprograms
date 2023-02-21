/*Write a Java program that takes input from the user in the form of a string and checks whether it is a palindrome or not. Your program should use exception handling to handle the following situations:*/

import java.util.Scanner;
class Exception2 {
  Scanner sc = new Scanner(System.in);
      String str;
      String reverse="";
     void palindromeString() {
       
    try {
       System.out.println("Enter the string");
       str=sc.nextLine();
      if (!str.matches("^[a-zA-Z]+$")) { throw new NumberFormatException();}
      for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        reverse=reverse+ch;
      }
        if(str.equalsIgnoreCase(reverse)){
          System.out.println("the given string is palindrome");
        }
         else
         System.out.println("the given string is not palindrome");
    }
     catch(NumberFormatException be){
       System.out.println("Exception.. on not entering string"+be);
      }
  }
  public static void main(String args[]) 
    {
   Exception2 e2 = new Exception2();
    e2.palindromeString();
}
}
}