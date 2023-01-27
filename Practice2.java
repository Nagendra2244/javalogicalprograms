//Write a program that takes a user's input of a number and a letter, and prints whether the number is even or odd and if the letter is a vowel or a consonant a method with no arguments and with no retun value.
import java.util.Scanner;
class Even {
  void consonet()
  {
  int num;
  char ch;
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
         num = sc.nextInt();
        System.out.print("Enter a letter: ");
        ch=sc.next().charAt(0);
    if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
 
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
        {
            System.out.println(ch+ " is a vowel.");
        } 
        else {
            System.out.println(ch+ " is a consonant.");
        }
  }
  }
class Practice2
  {
    public static void main(String[] args) {

      Even E1=new Even();
      E1.consonet();
    }
  }