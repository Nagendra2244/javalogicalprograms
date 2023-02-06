// Dyanamic array foreach loop
import java.util.Scanner;
public class Array12{
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter the element size");
       int  size=sc.nextInt();
     int[] arr=new int[num]; // Dynamic array
   for(int i=0;i<arr.length;i++){
      System.out.println("Enter the element");
       arr[i]=sc.nextInt();
      }
         for(int a: arr){
         System.out.println(a);
      }
   }
}
