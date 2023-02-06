// Sum of elements in Dynamic aaray
import java.util.*;
public class Array13 {
  public static void main(String[] args) {
      int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int[] arr=new int[size];//Dyanamic array
    for(int i=0;i<arr.length;i++){
    System.out.println("Enter the element");
      arr[i]=sc.nextInt();
      sum=sum+arr[i];
    }
    for(int a: arr){
      System.out.println(a);
    }
    System.out.println("sum of the array is "+sum);
}
}

