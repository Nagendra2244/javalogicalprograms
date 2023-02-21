/* Write a JAVAprogram to count total number of words in a string.*/

import java.util.Scanner;

public class work4 {
  public static void main(String[] args) {
         int i;
         int count=1;
          String st1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    st1=sc.nextLine();
      
    for(i=0;i<st1.length();i++) {
      if(st1.charAt(i)==' ') {
        count++;
      }
    }

    System.out.println("Number of words in the string:"+count);
  }
}