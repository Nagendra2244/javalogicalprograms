//print student id,details,total marks,student average by using else if ladder.
import java.util.Scanner;
public class marks
  {
  public static void main(String[] args) {
    int maths ;
    int physics;
    int chemistry;
    double average;
    int total;
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter maths marks : ");
      maths = sc.nextInt();
    System.out.println("Enter physics marks : ");
      physics = sc.nextInt();
    System.out.println("Enter chemistry  marks: ");
      chemistry = sc.nextInt();
    
    total = maths + physics + chemistry;
     average = total / 3.0;
    System.out.println("print the total marks: " +total);
    System.out.println("print the avg: "+average);
    
    if (maths > 40 && physics > 40 && chemistry > 40) {
      System.out.println("Student Pass");
      
      if (average < 50) {
        System.out.println("Grade: C");
      } else if (average >= 51 && average <= 70) {
        System.out.println("Grade: B");
      } else if (average >= 71 && average <= 80) {
        System.out.println("Grade: A");
      } else {
        System.out.println("Student Pass with Distinction");
      }
    } else {
      System.out.println("Student Fail");
    }
  }
}
