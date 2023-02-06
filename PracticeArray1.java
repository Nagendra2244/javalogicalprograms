//Program to create an array of a specified size and fill it with elements inputted by the user. The program then displays the elements of the array. 

import java.util.Scanner;

public class PracticeArray1 {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
     num = sc.nextInt();
    int[] arr = new int[num];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("The elements of the array are:");
    for (int i = 0; i < num; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}