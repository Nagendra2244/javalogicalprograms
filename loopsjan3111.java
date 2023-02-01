/* write a java program to print the amstrong number*/
import java.util.Scanner;
public class loopsjan3111{
    public static void main(String[] args) {
      int num,sum=0,temp,d;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num value:");
      num=sc.nextInt();
      temp=num;
      while(num>0){
        d=num%10;
        sum=sum+(d*d*d);
        num=num/10;
         }
      if(temp==sum){
        System.out.println("it is Amstrong number");
      }else{
        System.out.println("it is not Amstrong number");
      }
    }
}
      