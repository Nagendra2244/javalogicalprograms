/*Write a method called "printRandomNumber" that generates and prints a random number between 1 and 100 to the console.A method with no aruguments and no return value*/
//import java.util.lang.*;
import java.util.Scanner;
class Randomnumbers{
  int min;
  int max;
  int randomNumber;
  Scanner sc=new Scanner(System.in);
  void numbers(){
    System.out.println("Enter the minimum Value:");
    min=sc.nextInt();
     System.out.println("Enter the maximum Value:");
    max=sc.nextInt();
    randomNumber =((max - min) + 1) + min;
    System.out.println("print the RandomNumber Value:"+randomNumber);
  }
}
class Practice8{
  public static void main(String[] args){
    Randomnumbers R1=new Randomnumbers();
    R1.numbers();
  }
}