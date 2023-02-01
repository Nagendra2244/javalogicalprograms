/* to find the factorial of the given number by using forloop*/
import java.util.Scanner;
class factorialforlop{
  public static void main(String args[]){
    int fact;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of num:");
    num=sc.nextInt();
    for(fact=1;fact<=num;num--)
    {
      fact=fact*num;
      }
    System.out.println("the factorial of given number is:"+fact);
  }
}