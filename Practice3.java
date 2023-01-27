//Write a program that takes a user's input of a number and a letter, and prints whether the number is even or odd and if the letter is a vowel or a consonant a method with  arguments and with no retun value.
import java.util.Scanner;
import java.lang.String;
class Nagendra {
  
  void even(int num)
  {
  
      if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
  }
  void vowelconsonent(char ch)
  {
  if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
{
  System.out.println("given character is a vowel.");
        }
  else {
    System.out.println(" given chacter is a consonant.");
        }
  }
}
  class Practice3 {
    public static void main(String args[])
    {
      int num;
      char ch;
    Scanner sc = new Scanner(System.in);
      Nagendra N1=new Nagendra();
  System.out.print("Enter a number: ");
     num = sc.nextInt();
   System.out.print("Enter a letter: ");
     ch=sc.next().charAt(0);
    N1.even(num);
    N1.vowelconsonent(ch);
  }
  }