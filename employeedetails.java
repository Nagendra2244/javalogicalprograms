//Employee details in employee details in a method with no arguments and with no return value.
import java.util.Scanner;

class Employee {
  int eno;
  String ename;
  float esal;
  Scanner sc=new Scanner(System.in);
  void details() 
  {
    System.out.println("enter the Employee number:");
     eno=sc.nextInt();
     System.out.println("enter the employee name:");
     ename=sc.next();
     System.out.println("enter the employee salary:");
     esal=sc.nextFloat();
    
     System.out.println("print the employee number:"+eno);
     System.out.println("print the employee name:" +ename);
     System.out.println("print the employee salary:"+esal);
  
  }
}
class employeedetails
  {
  public static void main(String args[])
    {
     
  Employee e1=new Employee();
      e1.details();
    }
  }