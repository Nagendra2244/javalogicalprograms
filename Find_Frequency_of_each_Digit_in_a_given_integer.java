/*Write a JAVAprogram to find frequency of each digit in a given integer.
*/
import java.util.*;
class Find_Frequency_of_each_Digit_in_a_given_integer{
   
  public static void main(String arr[]) {
        Scanner sc=new Scanner(System.in);
        int number,i,count,digit,temp;
        
      System.out.println("Enter any Number : ");
        number=sc.nextInt();
         
      System.out.println("Digit\t Frequency");
        for(i=0;i<=9;i++)
        {
            count=0;
            temp=number;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"\t"+count);
            }
        }
    }
}
