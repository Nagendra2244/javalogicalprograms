/* write a java program to print the palindrome number*/
import java.util.Scanner;
public class loopsjan3110{
    public static void main(String[] args) {
      int num,reverse=0,temp,d;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num value:");
      num=sc.nextInt();
      temp=num;
      while(num>0){
        d=num%10;
        reverse=reverse*10+d;
        num=num/10;
         }
      if(temp==reverse){
        System.out.println("it is palindrome number");
      }else{
        System.out.println("it is not palindrome number");
      }
    }
}
      