//Write a program that takes a user's input of a number and a letter, and prints whether the number is even or odd and if the letter is a vowel or a consonant a method with  arguments and return value
import java.util.Scanner;
class Method {
  int num;
  int  even(int num){
    if(num%2==0){
      System.out.println("given number is even");
    } else{
      System.out.println("given number is odd");
    }
    return num;
   }
  char consonent(char ch){
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
      System.out.println("given number is letter is vowel");
    }else{
     System.out.println("given letter is consonent"); 
    }
    return ch;
  }
}
  class Practice4 {
    public static void main(String[] args){
      int num,z;
      char ch;
      Scanner sc=new Scanner(System.in);
      Method M1=new Method();
      System.out.print("Enter a number: ");
     num = sc.nextInt();
    System.out.print("Enter a letter: ");
     ch=sc.next().charAt(0);
      M1.even(num);
      M1.consonent(ch);
    }
  }
