/*Write a method called "printSum" that takes two integers their sum to the console.A method with  aruguments and no return value*/
import java.util.Scanner;
class Print{
int sum;
void Sum(int a,int b){
  sum=a+b;
System.out.println("print the Sum of two numbers:"+sum);
}
}
class Practice13{
  public static void main(String[] args){
    int first,second;
    Print P1=new Print();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first value:");
    first=sc.nextInt();
    System.out.println("Enter the second value:");
    second=sc.nextInt();
    P1.Sum(first,second);
  }
}
