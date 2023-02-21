/* Write a JAVAprogram to find lowest frequency character in a string. */

import java.util.Scanner;

public class work12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    int[] frequency = new int[256];
    for (int i=0;i<str.length();i++) {
      frequency[str.charAt(i)]++;
    }
    int min = Integer.MAX_VALUE;
    char ch = ' ';
    for (int i=0;i<str.length();i++) {
      if (frequency[str.charAt(i)] > 0 && frequency[str.charAt(i)] < min) {
        min = frequency[str.charAt(i)];
        ch=str.charAt(i);
      }
    }
    System.out.println("The lowest frequency character in Given stringis:"+min);
  }
}