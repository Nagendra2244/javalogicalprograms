//Superkey word
class base{
  int i=10;
}
  class derive extends base{
      int i=20;
    void display(){
      System.out.println("the base class value is:"+super.i);
       System.out.println("the derive class value is:"+i);
    }
  }
class Superkeyword1{
  public static void main(String[] args){
    derive d1=new derive();
      d1.display();
  }
}