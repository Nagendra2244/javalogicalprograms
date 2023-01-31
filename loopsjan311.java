
/*write a java program to print n natural  numbers*/
import java.util.Scanner;
class loopsjan311{
  public static void main(String[] args){
       int n;
      int i=1; 
      int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value:");
    n=sc.nextInt();
    
    while(i<=n){ 
      sum=sum+i;
       i++;
    }
    System.out.print("the sum of natural number:"+sum);
  }
}