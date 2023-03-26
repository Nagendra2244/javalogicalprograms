/*Print Array element in a method wit argument and with return value*/
import java.util.Scanner;

class MethodArray3 {
     int[] arrayMethod(int x[]) {
       //int m[]={};
      int m[] = new int[x.length];
    for (int i = 0; i < x.length; i++) {
      m[i] = x[i];
    }
    return m;
  }
}

class MethodArray12 {
  public static void main(String args[]) {
    int n, i;
    Scanner sc = new Scanner(System.in);
      MethodArray3 ma1 = new MethodArray3();
      System.out.println("Enter Array Size:");
       n = sc.nextInt();
        int a[] = new int[n];
    System.out.println("Enter Elements to Array:");
    for (i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    int[] p1 = ma1.arrayMethod(a);
    System.out.println("The Elements in an Array is:");
    for (i = 0; i < p1.length; i++) {
      System.out.print(" " + p1[i]);
    }
  }
}