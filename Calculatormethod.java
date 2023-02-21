// caluculator method
import java.util.Scanner;
 class Addition
   {
      int a=0,b=0,ch;
     double c;
     Scanner sc= new Scanner(System.in);
void add() 
     {
      
     System.out.println("CALCULATOR");
     System.out.println("-----------");
     System.out.println("[+].ADDITION");
     System.out.println("[-].SUBTRACTION");
     System.out.println("[*].MULTIPLICATION");
     System.out.println("[/].DIVISION");
     System.out.println("[%].REMAINDER");

       System.out.println("enter your choice");
       ch=sc.next().charAt(0);
      
       if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
      {
      System.out.println("enter a,b values:");
        a=sc.nextInt();
        b=sc.nextInt();
      }
       switch(ch)
        {
          case '+':
             c=(a+b);
             System.out.println("Print the Addition:" +c);
              break;
          case '-':
            c=(a-b);
            System.out.println("Print the Subtraction:" +c);
            break;  
          case '*':
            c=(a*b);
            System.out.println("Print the Multiplication:" +c);
            break;
          case '/':
            c=(a/b);
             System.out.println("Print the Division:" +c);
              break;
            case '%':
             c=(a %b);
             System.out.println("Print the Remainder:" +c);
              break;
        
          default:
            System.out.println("Wrong Chioce");
          }
     }
class Calculatormethod
{
  public static void main(String[] args){
    Addition a1=new Addition();
    a1.add();
  }
}
   }
