/*write a java program to print factorial of a given numbers*/
import java.util.Scanner;
class loopsjan313 {
  public static void main(String[] args){
      int num;
     long fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num value:");
    num=sc.nextInt();
    while(num>0){ 
      fact= fact*num;
       num--;
    }
    System.out.print("print the Given number Factorial:"+fact);
  }
}