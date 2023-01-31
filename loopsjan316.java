/*Write a Java Program to print Multiplication Table?
        n=5
 
   5  X  1 = 5
   5  X  2 = 10
   5  X  3 = 15
   __________
  __________
  __________
 
   5  X  10 = 50 */
import java.util.Scanner;
class loopsjan316{
  public static void main(String[] args){
  int num;
    int i=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the table number:");
  num=sc.nextInt();
  while (i<=10)
    {
     System.out.println(num+ " X " + i + " = " +i*num);
      i++;
   }
  } 
}