/*WAP to print square of all +ve values from array */

public class SquareOfAllPositiveValuesinArray{
    public static void main(String args[]){
        int arr[] = {1, -2, 3, -4, 5, -6, 7};
             for(int i=0;i<arr.length;i++) {
                if (arr[i]>0) {
                   int square = arr[i] * arr[i];
                     System.out.println(square);
                }
          }
      }
}
