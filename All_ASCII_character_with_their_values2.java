/* Write a JAVAprogram to print all ASCII character with their values.
user Taking Input*/
import java.util.Scanner;

public class All_ASCII_character_with_their_values2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.printf("Character: %c\tASCII Value: %d\n", ch, asciiValue);
    }
}