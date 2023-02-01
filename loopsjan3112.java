/* write a java program to print the reverse number*/
import java.util.Scanner;
public class loopsjan3112{
    public static void main(String[] args) {
      int num,rev=0,d;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num value:");
      num=sc.nextInt();
      while(num>0){
        d=num%10;
        rev=rev*10+d;
        num=num/10;
         }
        System.out.println("Print the reverse number:"+rev);
      }
}