//Final keyword with method
final class final3
{
 final void disp()
 {
 System.out.println("Its Super Class");
 }
}
class final2 extends final3 // error
{
 void disp() //error
 {
 super.disp();
 System.out.println("Its Sub Class");
 }
}
class Finalkeyword3
{
 public static void main(String args[])
 {
 final2 f=new final2();
 f.disp();
     
 }
}

/*final class base
{
 final void disp()
 {
 System.out.println("Its Super Class");
 }
}
class derive extends base // error
{
 void disp() //error
 {
 super.disp();
 System.out.println("Its Sub Class");
 }
}
class Finalkeyword3
{
 public static void main(String args[])
 {
 derive d1=new derive();
 d1.disp();
     
 }
}
*/

/*final class base{
   final int i=10;
  final  void display(){
     System.out.println("the derive class value is:"+i);
    }
}
  class derive extends base {
    int i=20;
    void display(){
        super.display();
       System.out.println("the derive class value is:"+i);
    }
  }
class Finalkeyword3{
  public static void main(String[] args){
    derive d1=new derive();
      d1.display();
  }
}
*/