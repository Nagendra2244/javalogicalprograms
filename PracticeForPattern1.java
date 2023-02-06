/* print the given patteren
1
2 3
4 5 6
7 8 9 10
  */
import java.util.Scanner;

class Pattern {
  int i, j, num;
  void NumTriangle(int num) {
    int count = 1;
    for (i=1;i<=num;i++) {
      for (j=1;j<=i;j++) {
        System.out.print(count + " ");
        count++;
      }
      System.out.println();
    }
  }
}

class PracticeForPattern1 {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    num = sc.nextInt();
    Pattern p1 = new Pattern();
    p1.NumTriangle(num);
  }
}


