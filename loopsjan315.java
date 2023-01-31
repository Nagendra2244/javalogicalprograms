/* write to a program to print only even numbers upto the given number*/
import java.util.Scanner;
public class loopsjan315 {
  public static void main(String[] args) {
    int num;
    int i=1;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    num =sc.nextInt();
    while (i <= num) 
    {
      if(num%2==0){
        System.out.println(i);
      }
        i++;
    }
  }
  }