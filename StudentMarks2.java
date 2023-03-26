import java.io.*;
class StudentMarks2{   
  public static void main(String args[])throws Exception    
  {       
    int sno,m1,m2,m3,tot;   
    String sname;      
    float avg;        
    DataInputStream dis=new DataInputStream(System.in);      System.out.println("Enter Student Number :");      sno=Integer.parseInt(dis.readLine());     
    System.out.println("Enter Student Name :");      sname=dis.readLine();     
    System.out.println("Enter Student Marks :");      m1=Integer.parseInt(dis.readLine());      m2=Integer.parseInt(dis.readLine());      m3=Integer.parseInt(dis.readLine());    
    tot=m1+m2+m3;        
    avg=tot/3;  
System.out.println("The Student Number is:"+sno);     System.out.println("The Student Name is:"+sname);     System.out.println("The Student Marks is:");     System.out.println("Maths:"+m1);     System.out.println("Physics:"+m2);     System.out.println("Chemistry:"+m3);   System.out.println("The Student Total is:"+tot);      System.out.println("The Student Average is:"+avg);     
  }
}    