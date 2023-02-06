// Write a java program to print n- natural numbers
import java.util.Scanner;
class Natural{
  int num;
 int i=1;
   void nNatural(int num){
    while(i<=num){
      System.out.println(i);
      i++;
    }
  
   }
}
class PracticeWhilenat{
  public static void main(String args[]){
  int num;
    Natural N1=new Natural();
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter the num value:");
  num=sc.nextInt();
  System.out.println("The n natural numbers is:");
  N1.nNatural(num); 
  }
}