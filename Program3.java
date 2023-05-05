class Program3 {
    public static void main(String args[])
        {
    int ar[] = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};//size=10
    int n = 7;
            n = ar[ar[n] / 2]; //10(7/2)=(10-7)/2
          System.out.println(ar[n] / 2);//3/2=1.5=1
        }
    }