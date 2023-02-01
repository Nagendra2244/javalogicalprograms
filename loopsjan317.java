/*write a Java program to find the sum of the N natural numbers*/
import java.util.Scanner;
public class loopsjan317 {

    public static void main(String[] args) {
            int num,sum=0,i=1;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num Value:");
         num=sc.nextInt();
        while(i<=num){
          sum=sum+i;
          System.out.println(sum);
          i++;
         }
    }
}