/*write a java program to print factorial of a given numbers*/
import java.util.Scanner;
class loops1feb1 {
  public static void main(String[] args){
      int num;
     int fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num value:");
    num=sc.nextInt();
    do{ 
      fact= fact*num;
       num--;
   }while(num>0);
    System.out.print("print the Given number Factorial:"+fact); 
  }
}
  