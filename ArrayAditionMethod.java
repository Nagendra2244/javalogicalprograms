// ArrayAddition Method
import java.util.*;
class ArrayDemo1 {
 Scanner sc = new Scanner(System.in);
 int i, j;
 void getMatrix(int x[][], int r, int c)
 {
    for(i=0;i<r;i++){
      for(j=0;j<c;j++){
      x[i][j]=sc.nextInt();

      }
    }
 }
 void dispMatrix(int x[][], int r, int c) {
      for(i=0;i<r;i++){
      for(j=0;j<c;j++){
        System.out.print("  "+x[i][j]);
      }
    }
  }
  
 void matAdd(int a[][], int b[][], int c[][], int r1, int c1) {
    for(i=0;i<r1;i++){
      for(j=0;j<c1;j++){
        System.out.print(" "+c[i][j]);
      }
    }
 }
}
class ArrayAditionMethod {
 public static void main(String args[]) {
 ArrayDemo1 ad1 = new ArrayDemo1();
 Scanner sc = new Scanner(System.in);
 int r1, c1, i, j;
 System.out.println("Enter Row Size:");
 r1 = sc.nextInt();
 System.out.println("Enter Col Size:");
 c1 = sc.nextInt();
 int a[][] = new int[r1][c1];
 int b[][] = new int[r1][c1];
 int c[][] = new int[r1][c1];
System.out.println("Enter Elements to 1st Matrix:");
    ad1.getMatrix(a,r1,c1);
System.out.println("Enter Elements to 2nd Matrix:");
    ad1.getMatrix(b,r1,c1);
   
   ad1.matAdd(a,b,c,r1,c1);
    
   System.out.println("The Addition of Two Matricies is:");
   ad1.getMatrix(c,r1,c1); 
 }
}