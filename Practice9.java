/*Write a method called "printRandomNumber" that generates and prints a random number between 1 and 100 to the console.A method with  aruguments and no return value*/
import java.util.Scanner;
class Randomnumbers{
  int randomNumber;
 void numbers(int min,int max){
    randomNumber = ((max - min) + 1) + min;
    System.out.println("print the RandomNumber Value:"+randomNumber);
  }
}
class Practice9{
  public static void main(String[] args){
    int a,b;
    Scanner sc=new Scanner(System.in);
    Randomnumbers R1=new Randomnumbers();
    System.out.println("Enter the minimum Value:");
    a=sc.nextInt();
    System.out.println("Enter the maximum Value:");
    b=sc.nextInt();
    R1.numbers(a,b);
  }
}