/*Write a method called "printRandomNumber" that generates and prints a random number between 1 and 100 to the console.A method with  aruguments and with return value===4th method */
import java.util.Scanner;
class Randomnumbers{
 int min,max;
  int randomNumber;
  Scanner sc=new Scanner(System.in);
 int numbers(){
    System.out.println("Enter the minimum Value:");
     min=sc.nextInt();
    System.out.println("Enter the maximum Value:");
     max=sc.nextInt();
    randomNumber = ((max - min) + 1) + min;
    return randomNumber;
  }
}
class Practice11{
  public static void main(String[] args){
    int c;
    Randomnumbers R1=new Randomnumbers();
    c=R1.numbers();
    System.out.println("print the RandomNumber Value:"+c);
  }
}