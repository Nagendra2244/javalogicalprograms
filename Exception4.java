// student marks using exception handling method
class NumberException extends Exception{
  int sub;
  NumberException(int sub){
    this.sub=sub;
  }
  public String toString(){
    return "Error .."+sub+"...Is less then 40";
  }
}
    public class Exception4{
  static void test(int sub)throws NumberException
  {
    if(sub<40){
      throw new NumberException(sub);
    }
    System.out.println("the student is passed with "+sub+"marks");
  }
  public static void main(String args[]){
    try{
    test(60);
    test(38);
    test(28);
    }
    catch(NumberException ae){
        System.out.println("the student is failed");
 }
}
}