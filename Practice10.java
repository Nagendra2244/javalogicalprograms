/*Write a method called "printRandomNumber" that generates and prints a random number between 1 and 100 to the console.A method with  aruguments and with return value*/
import java.util.Scanner;
class Randomnumbers{
  int randNumber;
 int numbers(int min,int max){
    randNumber = ((max - min) + 1) + min;
    return randNumber;
  }
}
class Practice10{
  public static void main(String[] args){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    Randomnumbers R1=new Randomnumbers();
    System.out.println("Enter the minimum Value:");
    a=sc.nextInt();
    System.out.println("Enter the maximum Value:");
    b=sc.nextInt();
     c=R1.numbers(a,b);
    System.out.println("print the RandomNumber Value:"+c);
  }
}