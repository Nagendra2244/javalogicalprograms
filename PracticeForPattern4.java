//Hallow Traingle Pattern//

import java.util.Scanner;
class Hallow{
  int i,j,k;
  void triangle(int num){
    for(i=1;i<=num;i++){
 for(j=1;j>=i;j--){
   System.out.println(" ");
 }  
   for(k=1;k<=j;k++){
     if(k==1||j==5||k==j)
       System.out.println("*");
     else
       System.out.println("  ");
   }   
      System.out.println();
      }
    
  }
}
class PracticeForPattern4{
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the num value:");
    num=sc.nextInt();
    Hallow H1=new Hallow();
    H1.triangle(num);
  }

}
  