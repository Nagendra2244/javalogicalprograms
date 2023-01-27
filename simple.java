// to find the maximum value of given three numbers by using simple if statements.

import java.util.Scanner;
public class simple
  {
    public static void main(String[] args) {
          int num1;
          int num2;
          int num3;
          int max=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 3  numbers values: ");
        num1 =sc.nextInt();
        num2 =sc.nextInt();
        num3 = sc.nextInt();
        if(num1>num2)
          max=num1;
        if(num2>num1)
         max=num2;
         if(num3>max)
           max=num3;
        System.out.println("print the maximum value is:"+max);
    }
  }