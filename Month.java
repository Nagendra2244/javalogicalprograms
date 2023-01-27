// Create a program that uses a switch case statement to determine the number of days in a month based on the month number.

import java.util.Scanner;

public class Month 
{
    public static void main(String[] args) 
  {
       int monthNum;
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
         monthNum = sc.nextInt();

        
        switch (monthNum) 
        {
           case 1 : 
           case 3 :
           case 7 : 
           case 5 :
           case 10 : 
           case 12:
           case 8 :
                 System.out.println("31 days for this month");
                  break;
              case 4 : 
              case 6:
              case 11:
              case 9:
                System.out.println("30 days for this month");
                break;
               case 2:
               System.out.println("28 days for this month");
              break;
         default:
        System.out.println("Invalid month");
   }
  }
}
    
    
  
