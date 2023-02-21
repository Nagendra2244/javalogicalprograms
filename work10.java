/* Write a JAVAprogram to count occurrences of a character in given string*/

import java.util.Scanner;

public class work10 {
  public static void main(String[] args) {
       String st1;
      char ch;
       int count=0,i;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    st1 = sc.nextLine();
    System.out.println("Enter a character to count its occurrences: ");
     ch = sc.nextLine().charAt(0);
  
    for (i=0;i<st1.length();i++) {
      if (st1.charAt(i)==ch) {
        count++;
      }
    }
    System.out.println("count occurrences of a character in given string: " +count);
  }
}