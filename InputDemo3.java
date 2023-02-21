import java.io.*;
class InputDemo3{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        float a;
        System.out.println("Enter Any Float value:");
        a=Float.parseFloat(br.readLine());
        System.out.println("The Given Float value is:"+a);
        }
    }