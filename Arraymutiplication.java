/* Array multiplication*/
import java.util.*;
class Arraymutiplication{
   public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
           int r1,c1,i,j;
         System.out.println("Enter Row Size:");
          r1=sc.nextInt();
         System.out.println("Enter Col Size:");
         c1=sc.nextInt();
            int a[][]=new int[r1][c1];
            int b[][]=new int[r1][c1];
            int c[][]=new int[r1][c1];
        System.out.println("Enter Elements to 1st Matrix:");
            for(i=0;i<r1;i++) {
                    for(j=0;j<c1;j++){
                        a[i][j]=sc.nextInt();
                }
            }
        System.out.println("Enter Elements to 2nd Matrix:");
                 for(i=0;i<r1;i++){
                      for(j=0;j<c1;j++){
                        b[i][j]=sc.nextInt();
                   }
                }
                    for(i=0;i<r1;i++){
                          for(j=0;j<c1;j++){
                               c[i][j]=0;
                     for(int k=0;k<c1;k++){
                     c[i][j]=c[i][j]+a[i][k]*b[k][j];
                       }
                }
            }
          System.out.println("The Product of two Matrices is:");
                     for(i=0;i<r1;i++){
                         for(j=0;j<c1;j++){
                       System.out.print(c[i][j]+" ");
                }
                 System.out.println();
              }
        }
  }