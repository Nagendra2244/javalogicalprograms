import java.io.*;
class InputDemo2{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        int n;
        System.out.println("Enter Any Integer value:");
        n=Integer.parseInt(br.readLine());
        System.out.println("The Given integer value is:"+n);
        }
    }