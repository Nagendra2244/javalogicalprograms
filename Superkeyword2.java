//Superkey word
class base{
  int i=10;
   void display(){
     System.out.println("the derive class value is:"+i);
    }
}
  class derive extends base{
      int i=20;
    void display(){
        super.display();
       System.out.println("the derive class value is:"+i);
    }
  }
class Superkeyword2{
  public static void main(String[] args){
    derive d1=new derive();
      d1.display();
  }
}