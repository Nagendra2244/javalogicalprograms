/* draw the patter below using methods and nested loops
A            A=65
B B          B=66
C C C        C=67
D D D D      D=68
E E E E E    E=69
  */
import java.util.Scanner;

class Pattern{
  int i, j, num;
  void NumTriangle(int num) {
    for (i=65;i<70;i++) {
    for (j=0;j<i-64;j++) {
        System.out.print((char)(i)+ " ");
    }
    System.out.println();
}
    }
  }

class PracticeForPattern2 {
  public static void main(String[] args) {
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Character: ");
    ch= sc.next().charAt(0); 
    Pattern p1 = new Pattern();
    p1.NumTriangle(ch); 
  }
}
