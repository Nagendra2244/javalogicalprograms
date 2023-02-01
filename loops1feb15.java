/*
   *  *  *  *  $
   *  *  *  $  *
   *  *  $  *  *
   *  $  *  *  *    
   $  *  *  *  *
  */
class loops1feb15 {
  public static void main(String[] args){
    int i,j; 
              
  for (i=1;i<=5;i++) 
  {
    for (j=1;j<=5;j++) 
    {
      if(i+j==6){
        System.out.print("\t$");
    }else{
    System.out.print("\t*");
    }
  }
    System.out.println();
}
  }
}