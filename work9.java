/*  Write a JAVAprogram to search all occurrences of a character in given string. */
import java.util.Scanner;

public class work9 {
  public static void main(String[] args) {
               String st1;
               char ch;
               int count=0;
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a string: ");
    st1=sc.nextLine();

    System.out.print("Enter a find character: ");
    ch=sc.next().charAt(0);

    int index =st1.indexOf(ch);
    

    while (index!=-1) {
      count++;
      System.out.println("The character" + ch + "is found at index" + index + " in the string");
      index = st1.indexOf(ch,index+1);
    }

    if (count == 0) {
      System.out.println("The character is found");
    } else {
      System.out.println("The character is not found");
    }
  }
}