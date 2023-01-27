// student details marks total average by using data types
import java.util.Scanner;

class student
{
public static void main(String args[])
{
    int sno,m,p,c,stot;
    String sname;
    float savg;
    Scanner  sc= new Scanner(System.in);
    System.out.println("Enter student number:");
    sno=sc.nextInt();
    System.out.print("Enter student name:");
    sname=sc.next();
    System.out.print("Enter marks of maths subjects:");
     m= sc.nextInt();
    System.out.print("Enter marks of chemistry subjects:");
    c= sc.nextInt();
    System.out.print("Enter marks of physics subjects:");
    p= sc.nextInt();
    stot = p + c + m;
    savg = stot / 3;
    
    System.out.println("Total marks :"+stot);
    System.out.println("Average marks : "+savg);
   

   }
}