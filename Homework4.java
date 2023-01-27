// Write a program that takes a grade as input and prints out the corresponding letter grade using else if ladder statements.
import java.util.Scanner;

public class Homework4
  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade (0-100): ");
        int grade = input.nextInt();
        
        if (grade >= 90) 
        {
            System.out.println("A-Grade");
        }
        else if (grade >= 80)
        {
            System.out.println("B-Grade");
        }
        else if (grade >= 70)
        {
            System.out.println("C-Grade");
        } 
        else if (grade >= 60) 
        {
            System.out.println("D-Grade");
        } 
        else {
            System.out.println("Fail");
        }
    }
}