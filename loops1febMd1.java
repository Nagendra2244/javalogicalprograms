/* a method with no arguments and no return value by using forloop
                    *
               *   *
          *   *   *
     *   *   *   *
*   *   *   *   *
  */
class Pattern{
  int i,j; 
  void tringle(){
  for(i=1;i<=5;i++){
      for(j=i;j<=5;j++){
        System.out.print("   ");
      }
      for(j=1;j<=i;j++){
        System.out.print(" * ");
      }
      System.out.println();
    }
}
}
class loops1febMd1 {
  public static void main(String[] args){
   Pattern p1=new Pattern();
    p1.tringle();
    }
  }
