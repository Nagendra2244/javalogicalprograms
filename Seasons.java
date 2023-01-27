// seasons by using Switch case
import java.util.Scanner;
public class Seasons {
  public static void main(String[] args) {
  String month;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the Month:");
  month =sc.nextLine();
 
    switch(month)
  {
    case 3: case 4: case 5: case 6:
         System.out.println("it Summer season");
        break;
    case 7: case 8: case 9: case 10:
       System.out.println("it Rainy Season");
        break;
    case 11: case 12: case 1: case 2:
       System.out.println("it is winter season");
        break;
   default:
        System.out.println("Wrong choice");
        }
  }
}