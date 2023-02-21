// Inheritance
import java.util.Scanner;
class A{
  String studentName;
  int studentId;
  int Social,Science,english,total,avg;
}
interface B{
  void report();
    
}
class c extends A implements B{
  void report(){
     System.out.println("   STUDENT DETAILS   ");
        System.out.println("------------------------");
        System.out.println("Student name:"+studentName);
        System.out.println("Student number is:"+studentId);
        System.out.println("Physics marks:"+Social);
        System.out.println("Chemistry marks:"+Science);
        System.out.println("Maths marks:"+English);
        System.out.println("Total marks:"+total);
        System.out.println("Average marks:"+avg);
  }
}
class inheritance1{
  public static void main(String[] args){
     total=social+science+English;
       avg=total/3;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter student name: ");
    studentName=sc.nextLine();
    System.out.print("Enter student ID: ");
    studentId=sc.nextInt();
    System.out.print("Enter marks for social: ");
    Social=sc.nextInt();
    System.out.print("Enter marks for science: ");
    Science=sc.nextInt();
    System.out.print("Enter marks for English: ");
    English=sc.nextInt();
    c a1=new c();
     a1.report();
     a1.report();
 }
}