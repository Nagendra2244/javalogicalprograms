import java.io.*;
class StudentMarks{
  public static void main(String args[]) throws IOException
  {
  
    
    
InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(in);
    
    String sname;
   int sid,m,p,c;
  float savg,stotal;
    
    
    System.out.println("Enter the student name:");
     sname=br.readLine();
    System.out.println("Enter the a Student Id:");
     sid=Integer.parseInt(br.readLine());
     System.out.println("Enter the maths marks:");
      m=Integer.parseInt(br.readLine());
     System.out.println("Enter the physics marks:");
     p=Integer.parseInt(br.readLine());
     System.out.println("Enter the chemistry marks:");
     c=Integer.parseInt(br.readLine());
     stotal=p+c+m;
     savg= stotal/3;
  
     System.out.println("---STUDENT DETAILS---");
    System.out.println("print the  student name:" +sname);
    System.out.println("print the student Id:"+sid);
    System.out.println("print the total marks:"+stotal);
    System.out.println("print the student average:"+savg);
  
  }
}