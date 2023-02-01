/*write a java program to print 1-10dits*/
import java.util.Scanner;
class loops1feb2{
  public static void main(String[] args){
    int i=1;
    Scanner sc=new Scanner(System.in);
    do{
      System.out.println(i);
      i++;
    }while(i<=10);
  }
}