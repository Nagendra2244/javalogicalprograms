/*Write a JAVAprogram to find length of a string and compare and concatenate two strings.*/
import java.util.Scanner;

public class work1 {
  public static void main(String[] args) {
    String str1;
      String str2;
      String str3;
      int len1;
      int len2;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter first string: ");
     str1=sc.nextLine();

    System.out.println("Enter second string: ");
     str2=sc.nextLine();

  
     len1=str1.length();
     len2=str2.length();

    System.out.println("Length of first string: " +len1);
    System.out.println("Length of second string: " +len2);

    if (str1.equals(str2)) {
      System.out.println("Both strings are equal.");
    } else {
      System.out.println("Both strings are not equal.");
    }
    
    str3=str1+str2;
    System.out.println("Concatenated string: "+str3);
  }
}