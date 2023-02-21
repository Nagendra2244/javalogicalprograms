// method overriding with reverse numbers
class Overriding1 {
    int n =563;

    void disp() {
        int rev=0;
        int d;
        while (n>0) {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
       System.out.println("print the reverse number:"+rev);
   }
}
class Overriding2 extends Overriding1 {
    int n=123;
    void disp() {
        int rev=0;
        int d;
        while (n>0) {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        
      System.out.println("print the reverse number:"+rev);
    }
}

 class Ovverriding2 {
    public static void main(String[] args) {
        Overriding1 v1 = new Overriding1();
        Overriding2 v2 = new Overriding2();
                    v1.disp();
                    v2.disp();
      /*overriding1 r;
 r=v1;
 r.disp();
 r=v2;
 r.disp();*/
    }
}
