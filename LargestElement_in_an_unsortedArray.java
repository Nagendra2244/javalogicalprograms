/*Implement a program to find the kth largest element in an unsorted array.*/
public class LargestElement_in_an_unsortedArray {
    public static void main(String args[]) {
        int arr[] = {5, 8, 12, 7, 6, 3};
        int k=3;
      for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1) {
  System.out.println("The k th largest element is:"+arr[i]);

            }
      }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
