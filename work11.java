/*  Write a JAVAprogram to find highest frequency character in a string.*/

import java.util.Scanner;

public class work11 {
  public static void main(String[] args) {
    String st1;
    int i;
    int max=0;
    char ch = ' ';
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    st1 = sc.nextLine();
    int[] frequency=new int[256];
    for (i=0;i<st1.length();i++) {
      frequency[st1.charAt(i)]++;
    }
    
    for (i=0;i<st1.length();i++) {
      if (frequency[st1.charAt(i)] > max) {
        max = frequency[st1.charAt(i)];
        ch=st1.charAt(i);
      }
    }
    System.out.println("The highest frequency character in String is:"+max);
  }
}