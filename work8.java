/*Write a JAVAprogram to find last occurrence of a character in a given string. */

import java.util.Scanner;

public class work8 {
  public static void main(String[] args) {
    
            String st1;
            char ch;
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a string: ");
    st1=sc.nextLine();

    System.out.print("Enter a character to find: ");
    ch=sc.next().charAt(0);

    int index=st1.lastIndexOf(ch);

    if (index==-1) {
      System.out.println("The character is not found in the string");
    } else {
      System.out.println("The last occurrence of character is at index in the string is:"+index);
    }
  }
}