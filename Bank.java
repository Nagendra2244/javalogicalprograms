class Bank{
String bankName,area;
void Bank()  {
System.out.println("inside constructor");
}
public static void main(String args[]){
Bank bank=new Bank();
System.out.println(bank.bankName);
   }
}