/*4.WAP to find count occurance of a number in an array*/

import java.util.*;

class OccurrenceOfArray {
    public static void main(String[] args) {
        int arr[]={2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index=2;
        int count=0;
        
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==index) {
                count++;
            }
        }
        
        System.out.println("Number of occurrences :"+count);
    }
}
