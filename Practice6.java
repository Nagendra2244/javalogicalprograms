// Banking simple Application creating by methods
//import java.util.lang.*;
public class Practice6{
  static int currentBalance=1000;
  public static void greetCustomer(){
    System.out.println("Hello,Welcome to Banking Application");
}
  public void deposit(int amount){
    currentBalance=currentBalance+amount;
     System.out.println("Amount is Deposit Sucessfully");
     }
  public static void withDrawl(int amount){
    currentBalance=currentBalance-amount;
    System.out.println("Amount is withdrawl Sucessfully");
  }
  public int getCurrentBalance(){
    return currentBalance;
 }
  public static void main(String[] args){
    Practice6 p1=new Practice6();
        greetCustomer();
    System.out.println("Current Balance is:"+currentBalance);
    p1.deposit(500);
    System.out.println("Current Balance is:"+currentBalance);
    withDrawl(400);
    System.out.println("Current Balance is:"+currentBalance);
  }
}

