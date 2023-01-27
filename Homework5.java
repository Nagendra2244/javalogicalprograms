//Write a program that takes the day of the week and the current time as input and prints out whether or not the library is open using if else lader statements.  

import java.util.Scanner;
class Homework5
{
  public static void main(String args[])
  {
    int day;
    int time;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any of the week day between 1 to 7: ");
    day=sc.nextInt();
    System.out.println("enter the time between 1 to 20 hours");
      time=sc.nextInt();
    if(day>=1 && day<=5){
      if(time>=9 && time<=20){
      System.out.println("Library is Opening.");
    }
      else 
        System.out.println("library timings are from 9am to 8pm");
    }
    else if(day>=6 && day<=7)
    {
     if (time>=9 && time <=20){
       System.out.println("saturday and sunday is closed");
      }
    
     else{
          System.out.println("you have netered invalid");
    }
  }
  }
}
    


        
        