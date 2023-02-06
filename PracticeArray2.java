
import java.util.Scanner;

public class PracticeArray2 {
    public static void main(String[] args) {
       int num,i,j;
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        num = sc.nextInt();
        int[] array = new int[num];

        System.out.println("Enter the elements of the array: ");
        for (i =0;i<num;i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the index of the element to delete: ");
        j = sc.nextInt();
        if(j>=0&&j<num) {
            for (i=j;i<num-1;i++) {
                array[i] = array[i + 1];
            }
            num--;
        } else {
            System.out.println("Invalid index.");
        }
        System.out.println("Array after deletion: ");
        for(i=0;i<num;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}