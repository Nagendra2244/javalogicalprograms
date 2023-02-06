//C20 print The whether the given number is Strong or not by using while loop
import java.util.Scanner;
public class C20Feb3_1{
  public static void main(String args[]){
    int num,fact=1,i=1,temp=0,sum=0,rem;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the num value:");
    num=sc.nextInt();
    temp=num;
    rem=temp%10;
    while(i<=rem){
      fact=fact*i;
        fact++;
      i++;
    } 
    sum=sum+fact;
    temp=temp/10;
    if(num==sum){
      System.out.println("It is a strong Number");
    }else{
      System.out.println("It is a not  strong Number");
      
    }
  }
  
}