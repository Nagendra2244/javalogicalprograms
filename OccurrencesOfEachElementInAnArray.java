/*Write a program to count the number of occurrences of each element in an array.*/
import java.util.*;
public class OccurrencesOfEachElementInAnArray{
  public static void main(String args[]){
    int size,occuranceNumber,count=0,i;
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of elements you want in array:");
        size = sc.nextInt();
        int arr[]=new int[size];
System.out.println("Enter all the elements:");
        for(i=0;i<size;i++){
          arr[i]=sc.nextInt();
        }
System.out.print("Enter the element of which you want to count number of occurrences:");
        occuranceNumber=sc.nextInt();
        for(i=0;i<size;i++){
            if(arr[i]==occuranceNumber){
                count++;
            }
        }
System.out.println("Numberof Occurrence of the Element:"+count);
  }
}