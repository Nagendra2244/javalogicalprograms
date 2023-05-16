/*Wap to accept a value from user and check if the value is in array print index otherwise print value not find.*/
import java.util.*;

public class ArrayindexPosition {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int search=sc.nextInt();
        int index=0;
      for(int i=0;i< arr.length;i++) {
            if (arr[i]==search) {
                index=i;
          }
   }
if (index!=0) {
    System.out.println("Value found at index:"+index);
        } 
else {
  System.out.println("Value not found.");
        }
    }
}
