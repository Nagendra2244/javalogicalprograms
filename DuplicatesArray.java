/*5.WAP to print all Duplicates values from array*/

import java.util.*;

public class DuplicatesArray {
  public static void main(String[] args) {
        int[] arr={2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      System.out.println("Duplicate values:");
      for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
           if (arr[i]==arr[j]) 
               {
              System.out.println(arr[i]);
             }
        }
     }
  }
}
