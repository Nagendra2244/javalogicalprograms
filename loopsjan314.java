/* write to a program to print given number prime number or not*/
import java.util.Scanner;
class loopsjan314 {
  public static void main(String[] args){
      int num;
      int i=1,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num value:");
    num=sc.nextInt();
    while(i<=num){ 
        if(num%i==0){
          count++;
        }
         i++; 
      }
      if(count==2){
      System.out.print("it is a prime number");
      }
  else{
   System.out.print("it is a not prime number");
  }
}
}