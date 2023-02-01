import java.util.*;
class Palindrome
  {
     boolean palin(int n)
    {
      int d,r=0,t;
      t=n;
      while(n>0)
       {
         d=n%10;
         r=r*10+d;
         n=n/10;
       }
      if(t==r)
        return true;
      else 
        return false;
    }
    
  }
 
class loops1feb9
  {
    public static void main(String args[])
    {
       int i,num;
      boolean res;
       Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any Number:");
      num=sc.nextInt();
      Palindrome p1=new Palindrome();
      res=p1.palin(num);
      if(res==true)
      System.out.println("Its Palindrome Number");
      else
     System.out.println("Its Not Palindrome Number");   
    }
  }