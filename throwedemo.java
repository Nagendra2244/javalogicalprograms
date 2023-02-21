class throwdemo{
  public static void main(String args[]){
   try{
    ArithmeticException e=new ArithmeticException("Hello,Exception occured");
    throw e;
    //throw new ArithmeeticException("Hello,Exception occured");
  }
    catch(ArithmeticException ae){
      System.out.println("ThenException is:"+ae.getMessage());
    }
}
}