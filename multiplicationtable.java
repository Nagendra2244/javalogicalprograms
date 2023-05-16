/*3.WAP to print an multiplication table of a number*/

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        System.out.println("Multiplication Table");

        for (int i = 1; i <= 10; i++) {
          
      System.out.println(num + " x " + i + " = " +num*i);
        }
    }
}
