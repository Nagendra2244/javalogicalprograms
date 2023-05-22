/*Write a Java program to find the maximum sum subarray in an array.*/
import java.util.Arrays;

public class SubArrayWithMaximumSum{
    public static void main(String[] args) {
        int[] arr={-3, 4, -2, 5, 6, -7, 4, 2, -3, 1 };
        int maxSum=arr[0];
        int currentSum=arr[0];
        int start=0;
        int end=0;
        int tempStart=0;

        for(int i=1;i<arr.length;i++) {
            if(arr[i]>currentSum+arr[i]) {
                currentSum=arr[i];
                tempStart=i;
            } 
            else {
                currentSum=currentSum+arr[i];
            }
           if(currentSum>maxSum) {
                maxSum=currentSum;
                start=tempStart;
                end=i;
            }
        }
        System.out.print("Subarray with maximum sum: ");
        for (int i=start;i<=end;i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Maximum sum of subarray:"+maxSum);
    }
}
