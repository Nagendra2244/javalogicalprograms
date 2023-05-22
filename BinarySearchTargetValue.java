/*Write a Java program to implement a binary search algorithm to search for an element in a sorted array*/

import java.util.*;

public class BinarySearchTargetValue{
    public static int binarySearch(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;

        while (left<=right) {
            int mid=left+(right-left)/2;

            if (arr[mid]==target) {
                return mid; // Element found
             } 
            else if (arr[mid]<target) {
                left=mid+1; // Search in the right half
            } 
            else {
                right=mid-1; // Search in the left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target=sc.nextInt();

        int index=binarySearch(arr, target);

        if (index>=0) {
         System.out.println("Element found at index " + index);
        } 
        else {
         System.out.println("Element not found in the array.");
        }
    }
}

