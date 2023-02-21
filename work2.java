/*Write a JAVAprogram to find total number of alphabets, digits or special character in a string.*/
import java.util.Scanner;
public class work2{
public static void main(String args[]){
    String st1;
int i,Alphabets=0,num=0,spaces=0,Specialcharacters=0;

 Scanner sc=new Scanner(System.in); 
  
    
System.out.println("Enter the String  ");
st1=sc.nextLine();

for(i=0;i<st1.length();i++){
char ch=st1.charAt(i);
if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){ 
    Alphabets++;
}

else if(ch>='0'&&ch<='9'){ 
    num++;
}
else if(ch==' '){
    spaces++;    
}
else{ 
    Specialcharacters++;
}

}
System.out.println("Number of Alphabet letters: "+Alphabets);
System.out.println("Number of Digits in string: "+num);
System.out.println("number of Space: "+spaces);
System.out.println("Special characters in String: "+Specialcharacters);
}
}