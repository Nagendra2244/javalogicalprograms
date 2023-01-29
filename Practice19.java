/*Write a method called "printMultiplicationTable" that prints the multiplication table for the numbers 1 through 10. a metod with out arguments and with  return value----4th method*/ 
import java.util.Scanner;
class Multi{
  int num;
Scanner sc=new Scanner(System.in);
  int Multiplication(){
    System.out.println("Enter the table number:");
     num=sc.nextInt();
    System.out.println("-----Your Table------");
   System.out.println("---------------------"); 
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
    else{
      System.out.println();
  }
  return num;
}
}
class Practice19{
  public static void main(String[] args){
    int c;
    Multi m1=new Multi();
    c=m1.Multiplication();
  }
}

  
