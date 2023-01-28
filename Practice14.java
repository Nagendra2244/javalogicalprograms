/*Write a method called "printSum" that takes two integers their sum to the console.A method with  aruguments and wit return value*/
import java.util.Scanner;
class Print{
  int sum;
  
  int Sum(int first,int second){
    sum=first+second;
    return sum;
    }
}
class Practice14{
  public static void main(String[] args){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    Print p1=new Print();
    System.out.println("Enter the first and second values:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=p1.Sum(a,b);
    System.out.println("Print the sum of two numbers:"+c);
  }
}