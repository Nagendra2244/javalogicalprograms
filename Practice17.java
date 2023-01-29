/*Write a method called "printMultiplicationTable" that prints the multiplication table for the numbers 1 through 10. a metod with arguments and with no return value*/ 
import java.util.Scanner;
class Multiplication{
  int num;
  void Multi(int num){
    if(num>=1&&num<=20){
      if ((num) >= 1 && (num) <= 20){
     System.out.println(num+"*1="+num*1);
      System.out.println(num+"*2="+num*2);
      System.out.println(num+"*3="+num*3);
      System.out.println(num+"*4="+num*4);
      System.out.println(num+"*5="+num*5);
      System.out.println(num+"*6="+num*6);
      System.out.println(num+"*7="+num*7);
      System.out.println(num+"*8="+num*8);
      System.out.println(num+"*9="+num*9);
      System.out.println(num+"*10="+num*10);
      }
      System.out.println();
   }
    }
  }
class Practice17{
  public static void main(String[] args){
    int a;
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter the table number:");
  a=sc.nextInt();
  Multiplication m1=new Multiplication();
  System.out.println("-----Your Table------");
  System.out.println("---------------------");
     m1.Multi(a);
  }
}