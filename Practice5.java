//Write a program that takes a user's input of a number and a letter, and prints whether the number is even or odd and if the letter is a vowel or a consonant a method with  arguments and return value-4
import java.util.Scanner;
class Method{
 int num;
  Scanner sc=new Scanner(System.in);
  int even(){
    System.out.println("Enter the number:");
    num=sc.nextInt();
    if(num%2==0){
      System.out.println("Given number is Even");
    }
    else{
      System.out.println("Given number is odd");
    }
    return num;
    }
  char consonent(){
    char ch;
    System.out.print("Enter a letter: ");
     ch=sc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
      System.out.println("given number is letter is vowel");
    }else{
     System.out.println("given letter is consonent"); 
    }
    return ch;
  }
}
  class Practice5{
    public static void main(String[] args){
      Method M1=new Method();
      M1.even();
      M1.consonent();
      }
  }