// Sum of N natural numbers
import java.util.Scanner;
class Natural{
  int num;
  int sum=0;
 int i=1;
   void nNatural(int num){
    while(i<=num){
      sum=sum+i;
      i++;
    }
  System.out.println("Sum of Natural numbers:"+sum);
   }
}
class PracticeWhileSumnat{
  public static void main(String args[]){
  int num;
    Natural N1=new Natural();
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter the num value:");
  num=sc.nextInt();
  //System.out.println(Sum of Natural numbers:+sum);
  N1.nNatural(num); 
  }
}