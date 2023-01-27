// Write a program that takes a grade as input and prints out the corresponding letter grade using nested if statements. 

import java.util.Scanner;

public class Homework1
  {
  public static void main(String[] args) {
    int grade;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your grade (0-100): ");
    grade = sc.nextInt();
     
    if (grade >= 100) 
        {
          if (grade >= 85)
          {
            System.out.println("A-Grade");
        } 
        else {
         System.out.println("B-Grade");
        }
        } 
    else{
      if(grade>=75){
        System.out.println("B-Grade");
      }
      else
      {
        System.out.println("C-Grade");
      }
    }
    else
    {
      if(grade>=65){
        System.out.println("C-Grade");
      }
      else
      {
        System.out.println("D-Grade");
      }
      
    }
  
     else {
      if(grade>=35) {
        System.out.println("D-Grade");
      }
      else
      {
        System.out.println("Fail");
      }
      
    }
    else {
      System.out.println("Fail");
    }
  }
}