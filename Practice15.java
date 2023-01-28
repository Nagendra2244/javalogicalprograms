/*Write a method called "printSum" that takes two integers their sum to the console.A method with  aruguments and wit return value-4th method*/
import java.util.Scanner;
class Print{
  int sum;
  int first,second;
  Scanner sc=new Scanner(System.in);
  int Sum(){
  System.out.println("Enter the first and second value:");
  first=sc.nextInt();
  second=sc.nextInt();
    sum=first+second;
  return sum;
}
}
class Practice15{
  public static void main(String args[]){
    int a,b,c;
    Print p1=new Print();
    c=p1.Sum();
    System.out.println("Print the Sum of two numbers:"+c);
  }
}