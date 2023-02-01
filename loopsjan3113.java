/*sum of digits*/
import java.util.Scanner;
public class loopsjan3113{
    public static void main(String[] args) {
      int num,sum=0,d;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num value:");
      num=sc.nextInt();
      while(num>0){
        d=num%10;
        sum=sum+d;
        num=num/10;
         }
        System.out.println("Print the digits :"+sum);
      }
}