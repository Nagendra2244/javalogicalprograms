/* Write a JAVAprogram to count total number of vowels and consonants in a string. */

import java.util.Scanner;

public class work3 {
  public static void main(String[] args) {
           int vCount = 0;
           int cCount = 0;
            String st1;
              int i;
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a string: ");
    st1=sc.nextLine();
  
    for(i=0;i<st1.length();i++) {        
            if(st1.charAt(i)=='a'||st1.charAt(i)=='e'||st1.charAt(i)=='i'||st1.charAt(i)=='o'||st1.charAt(i)=='u') {    
           
                vCount++;    
            }    
              
            else if(st1.charAt(i)>='a'&&st1.charAt(i)<='z') {        
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " +cCount);    
    }    
}   