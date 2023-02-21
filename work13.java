/* Write a JAVAprogram to count frequency of each character in a string*/
import java.util.Scanner;
public class work13{
	
   public static void main(String args[])
   {
	   
	        String st1;
           char ch;
           int i,freq=0;
          Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string:");
          st1 =sc.nextLine();
        System.out.println("Enter a finding character:");
         ch=sc.next().charAt(0);

           for(i=0;i<st1.length();i++) 
           {
               if(ch == st1.charAt(i)) 
               {
                   freq++;
               }
           }
           System.out.println("Frequency of character is:"+freq);
		
   }
}
