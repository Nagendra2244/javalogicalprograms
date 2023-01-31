/*write a java program to print factorial of a given numbers*/
import java.util.Scanner;
class loopsjan312 {
  public static void main(String[] args){
      int num;
      int i=1; 
      int fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num value:");
    num=sc.nextInt();
    
    while(i<=num){ 
      fact=fact*i;
       i++;
    }
    System.out.print("print the Given number Factorial:"+fact);
  }
}