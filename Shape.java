/* Create a program that uses a switch case statement to determine the area of a shape based on the shape's name in JAVA.*/
import java.util.Scanner;
public class Shape {
public static void main(String[] args){
  int length,width,a,b,h,r; 
  double area;
  String shape;
  Scanner sc=new Scanner(System.in);
  
 
  System.out.println("Enter the Shape");
  shape=sc.next();
  
  switch(shape)
  {
    case "square":
            System.out.println("enter the side");
               a=sc.nextInt();
              area=(a*a);
           System.out.println("print the area of square:"+area);
          break;
      case "rectangle":
          System.out.println("enter the length:");
             length=sc.nextInt();
       System.out.println("enter the width:");
             width=sc.nextInt();
             area=length*width;
      System.out.println("print the area of rectangle:"+area);
        break;
        case "triangle":
         System.out.println("Enter the b value:");
               b=sc.nextInt();
             System.out.println("Enter the h value:");
               h=sc.nextInt();
               area=0.5*b*h;
      System.out.println("Print the area of triangle:"+area);
         break;
    case "circle":
      System.out.println("Enter the radius:");
        r=sc.nextInt();
        area= 3.14 * r * r;
        System.out.println("Print the area of circle:"+area);
      break;
    default:
      System.out.println("wrong choice");
  }
  
           
  }
    
}