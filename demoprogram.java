class demoprogram{
  public static void main(String[] args){
    Thread th=new Thread();
    System.out.println("current thread is:"+th);
    th.setName("Nagendra");
    System.out.println("current thread is:"+th);
  }
}