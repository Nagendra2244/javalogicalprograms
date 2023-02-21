/* Write a JAVAprogram to find reverse of a string.    */


import java.util.Scanner;
class work5{
  public static void main(String[] args){
    String st1;
    String reverse="";
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String st1:");
    st1=sc.nextLine();
    for(i=st1.length()-1;i>=0;i--){
         char ch=st1.charAt(i);
      reverse=reverse+ch;
    }
    System.out.println("The length of the given String is:"+reverse);
  }
}