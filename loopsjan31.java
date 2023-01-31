/*write a java program to print n natural  numbers*/
import java.util.Scanner;
class loopsjan31{
  public static void main(String[] args){
       int n;
      int i=1; 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value:");
    n=sc.nextInt();
    while(i<=n){ 
      System.out.println(""+i);
      i++;
    }
  }
}