/*Print Array element in a method wit no argument and no return value*/
import java.util.*;
class MethodArray1
{
void arrayMethod()
 {
 int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array Size:");
 n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter Elements to Array:");
 for(i=0;i<a.length;i++)
 {
 a[i]=sc.nextInt();
 }
 System.out.println("The Elements in an Array is:");
for(i=0;i<a.length;i++)
 {
 System.out.print(" "+a[i]);
 }
}
}
class MethodArray
{
 public static void main(String args[])
 {
 MethodArray1 ma1=new MethodArray1();
 ma1.arrayMethod();
}
}