// take user inputs to print employee id,name,salary,by using data types 
import java.util.Scanner;

public class today5
  {
    public static void main(String[] args)
    {
    
       int eid;
       String ename;
       float esal;
       Scanner input = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        eid = input.nextInt();
        System.out.print("Enter employee name: ");
        ename = input.next();
        System.out.print("Enter employee salary: ");
        esal = input.nextFloat();
        
      
        System.out.println("Print employee ID: " + eid);
        System.out.println("Print employee Name: " + ename);
        System.out.println("Print employee Salary: " + esal);
    }
}




