/*
Find the frequencies of all duplicates elements in the array
 Input: arr[] = {2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6} 
Output: Below is the frequency of repeated elements – 
4 –> 4 
5 –> 2 
6 –> 3
Input: arr[] = {4, 4, 5, 5, 6} 
Output: Below is the frequency of repeated elements – 
4 –> 2 
5 –> 2
*/


public class Arrayfrequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6};
        int i,j;
        int count;
        int n = arr.length;
        for (i=0;i<n;i++) {
        for (j=i+1;j<n;j++) {
                if (arr[i]==arr[j]) {
                    count++; 
                  fr[j] = visited;  
                }  
            }  
        }
            if(fr[i] != visited)  
                fr[i] = count;   
  
       for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
  }
}
  