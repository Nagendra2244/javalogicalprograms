/*Implement a program to find the median of two sorted arrays.*/

public class MedianOfTwoSortedArrays{
    public static void main(String[] args) {
        int arr1[]={2,6,7,8,10};
        int n=arr1.length;
        int arr2[]={10,12,17,18,90,91};
        int m=arr2.length;
        int arr3[]=new int[n+m];
         for(int i=0;i<n;i++){
            arr3[i]=arr1[i];
        }
        int j=n;
        for(int i=0;i<m;i++){
            arr3[j++]=arr2[i];
        }
      for(int i=0;i<(n+m);i++) {
            for (int k=(i+1);k<(n+m);k++) {
                if(arr3[i]>arr3[k]) {
                    int temp=arr3[i];
                    arr3[i]=arr3[k];
                    arr3[k]=temp;
                }
            }
        }
       double median;
        int middle=(n+m)/2;
        if((n+m)%2==0){
        median=(arr3[middle-1]+arr3[middle])/2.0;
        } 
        else{
            median=arr3[middle];
        }
      System.out.println("median of two sorted arrays:"+median);
    }
}
