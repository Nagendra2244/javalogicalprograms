class addition
{
protected  int a=10,b=5;
      void add()
      {
           int c;
             c=a+b;
            System.out.println("The Addition is:"+c);
      }
}
class subtract extends addition
{
        void sub()
        {
              int d;
                 d=a-b;
            System.out.println("The Subtraction is:"+d);
      }
}
class singleinheritance
{
   public static void main(String args[])
    {
           subtract s=new subtract();
            s.add();
            s.sub();
   }
}