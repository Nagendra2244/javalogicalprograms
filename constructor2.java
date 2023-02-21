// Non-parameterized constructor

class Condemo1
 {
 int a,b;
 Condemo1() // Non - Parameterized Constructor
 {
   
 a=10;
 b=20;
 }
 void display()
 {
 System.out.println("The a value is:"+a);
 System.out.println("The b value is:"+b);
 }
 }
class constructor2
 {
 public static void main(String args[])
 {
 Condemo1 c1=new Condemo1();
 c1.display();
}
}