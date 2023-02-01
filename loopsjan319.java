/* write a java program to print the strong number or not*/
import java.util.Scanner;
public class loopsjan319{
    public static void main(String[] args) {
         int num;
        int temp;
        int sum=0;
        int rem=0;
        int fact=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value:");
      num=sc.nextInt();
        temp=num;
        while(num >0){     
            rem=num%10;  
            fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;     
        }
        
    if(temp==sum){
            System.out.println("The given number is strong number");
    }
    else{
        System.out.println("The given number is not strong number");
    }    
    }
}
