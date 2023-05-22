/*Write a Java program to find all pairs of elements in an array whose sum is equal to a given target value.
*/

import java.util.*;

public class FindPairs{
   public static void main(String args[]){
     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int size=sc.nextInt();
      int arr[]=new int[size];
      
      System.out.println("Enter the elements of the array: ");
      for(int i=0;i<size;i++){
         arr[i]=sc.nextInt();
      }
      
      System.out.println("Enter the number:");
      int num=sc.nextInt();
      
      System.out.println("The array is: "+Arrays.toString(arr));
      System.out.println("Array whose sum is:"+num);
      
      for(int i=0;i<arr.length;i++){
         for (int j=i;j<arr.length;j++){
            if((arr[i]+arr[j])==num&&i!=j){
               System.out.println(i+","+j);
            }
         }
      }
   }
}
