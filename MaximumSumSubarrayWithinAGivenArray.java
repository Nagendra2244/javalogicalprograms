/*Write a program to find the maximum sum subarray within a given array.
*/
public class MaximumSumSubarrayWithinAGivenArray{
    public static void main(String[] args) {
        int[] arr={1,3,8,-2,6,-8,5};
        int maxSum=0;
      for(int i=0;i<=arr.length-1;i++){
            int currSum=0;
          for(int j=i;j<=arr.length-1;j++){
                currSum=currSum+arr[j];
                if(currSum>maxSum) {
                    maxSum=currSum;
                }
            }
        }
       System.out.println("Maximum sum subarray:"+maxSum);
    }
}


