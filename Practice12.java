/*Write a method called "printSum" that takes two integers their sum to the console.A method with no aruguments and no return value*/
import java.util.Scanner;
 class Sum {
   int first,second,sum;
   Scanner sc=new Scanner(System.in);
   void printSum() {
      System.out.println("Enter the First value:");
      first=sc.nextInt();
     System.out.println("Enter the Second value:");
      second=sc.nextInt();
     sum=first+second;
        System.out.println("The sum of " + first + " and " + second + " is " + sum);
    }
 }
class Practice12{
    public static void main(String[] args) {
      Sum S1=new Sum();
         S1.printSum();
    }
}
