/*Print Array element in a method wit argument and no return value*/
import java.util.Scanner;
class MethodArray2
      {
  void arrayMethod(int x[])
    {
        int i;
     System.out.println("The Elements in an Array is:");
       for(i=0;i<x.length;i++)
      {
       System.out.print(" "+x[i]);
     }
     }
}
class MethodArray11{
  public static void main(String args[]){ 
            int n,i;
     Scanner sc=new Scanner(System.in);
    MethodArray2 ma1=new MethodArray2();
      System.out.println("Enter Array Size:");
       n=sc.nextInt();
       int a[]=new int[n];
      System.out.println("Enter Elements to Array:");
       for(i=0;i<a.length;i++)
          {
            a[i]=sc.nextInt();
          }
            ma1.arrayMethod(a);
    }
}