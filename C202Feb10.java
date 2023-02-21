/* third largest number in an array*/
import java.util.Scanner;
public class C202Feb10 {
  public static void main(String[] args) {
    int i, j, temp, n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the memory size:");
    n = sc.nextInt();
    int[] a=new int[n];
    System.out.println("Enter the elements in the array:");
    for (i=0;i<n;i++) {
      a[i]=sc.nextInt();
    }
    System.out.println("Before sorting");
    
    for (i=0;i<n;i++) {
      System.out.println(" "+a[i]);
    }
    for (i=0;i<n-1;i++) {
      for (j=0; j<n-1-i;j++) {
        if (a[j]>a[j+1]) {
          temp=a[j + 1];
          a[j+1]=a[j];
          a[j]=temp;
        }
      }
    }
    
    System.out.println("After sorting");
    for (i=0;i<n;i++) {
      System.out.println(" "+a[i]);
    }
     System.out.println("third largest value in an array is:"+a[i-3]);
  }
}