class Overriding1 {
    int n = 121;

    void disp() {
        int rev=0;
        int temp=n;
        while (n>0) {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev) 
        {
        System.out.println("It's a palindrome");
        } 
        else {
      System.out.println("It's not a palindrome");
        }
   }
}
class Overriding2 extends Overriding1 {
    int n=123;
    void disp() {
        int rev=0;
        int temp=n;
        while (n>0) {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (temp==rev) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}

 class ovverriding1 {
    public static void main(String[] args) {
        Overriding1 v1 = new Overriding1();
        Overriding2 v2 = new Overriding2();
overriding1 r;
 r=v1;
 r.disp();
 r=v2;
 r.disp();
    }
}
