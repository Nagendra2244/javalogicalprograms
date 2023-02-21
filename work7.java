/*  Write a JAVAprogram to find first occurrence of a character in a given string.*/

import java.util.Scanner;

public class work7 {
  public static void main(String[] args) {
            String st1;
            char ch;
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter a string:");
    st1 =sc.nextLine();

    System.out.println("Enter a finding character:");
    ch=sc.next().charAt(0);

    int index = st1.indexOf(ch);

    if (index == -1) {
      System.out.println("The character is not found in the given string.");
    } else {
      System.out.println("The first occurrence of character s at index  in the string is:"+index);
    }
  }
}