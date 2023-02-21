// student marks using exception handling method
import java.util.Scanner;
class NumberException extends Exception{
  int max,phy,che;
  NumberException(int max,int phy,int che){
    this.max=max;
    this.phy=phy;
    this.che=che;
  }
  public String toString(){
    return "Error .."+max+" "+phy+" "+che+"...Is less then 40";
  }
}
    public class Exception5{
  static void test(int max,int phy,int che)throws NumberException
  {
    if(max<40||phy<40||che<40){
      throw new NumberException(max,phy,che);
    }
    System.out.println("the student is passed in mathematics with: "+max+"marks");
    System.out.println("the student is passed in physics with: "+phy+"marks");
    System.out.println("the student is passed in chemistry with: "+che+"marks");
  }
  public static void main(String args[]){
    try{
    test(40,50,60);
    }
    catch(NumberException ae){
        System.out.println("the student is failed");
}
}
}