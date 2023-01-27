// print the vowel or consonents by using conditional if else statements
import java.util.Scanner;

public class Vowel
  {

    public static void main(String[] args) 
    {

      char ch;
      Scanner sc = new Scanner(System.in);  
       System.out.print("Enter any character: ");  
       ch = sc.next().charAt(0);  

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        {
            System.out.println("It is vowel");
        }
        else
        {
          System.out.println("It is consonent");
        }

    }
}