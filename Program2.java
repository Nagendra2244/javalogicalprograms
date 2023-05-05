class Program2 {
    public static void main(String args[]) {
        int index = 0;
        boolean flag = true;
        boolean a = false, b;
        b = (flag | ((index++) == 0)); //true/1=>b=1
        b = (a | ((index += 2) > 0));//false/2+1>0=>b=3
        System.out.println(index);//3
    }
}