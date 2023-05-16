/*WAP to accept an array fill all the values with 0 appart from first and last value*/
public class LastIndexOfArray {
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5}; 
      for (int i=1;i < array.length-1;i++) {
            array[i]=0;
        }
      for (int i=0;i< array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
}
