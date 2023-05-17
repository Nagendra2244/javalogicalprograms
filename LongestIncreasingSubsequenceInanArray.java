/*Write a program to find the longest increasing subsequence in an array.
*/
public class LongestIncreasingSubsequenceInanArray{
  public static void main(String[] args){
    int arr1[]={10,22,9,33,21,50,41,60};
        int arr2[]=new int[arr1.length];
        int i, j, max=0;
        
        for(i=0;i<arr1.length;i++){
            arr2[i]=1;
            for(j=0;j<i;j++){
                if (arr1[i]>arr1[j] && arr2[i]<arr2[j]+1){
                    arr2[i]=arr2[j]+1;
                }
            }
        }
        for(i=0;i<arr1.length;i++) {
            if(max<arr2[i])
                max=arr2[i];
        }
System.out.println("The length of the longest increasing subsequence is:"+max);
    }
  }
