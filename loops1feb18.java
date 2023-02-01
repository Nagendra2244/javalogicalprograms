/*
*       * 
  *   *   
    *     
  *   *   
*       * 
*/
class loops1feb18 {
  public static void main(String[] args){
    int i,j; 
               for(i=0;i<=5;i++) 
                   {
                for (j =1;j<=5;j++) 
                   {
                   if (i+j==6||i==j) 
                  {
                 System.out.print("* ");
                  } 
                  else 
                   {
                    System.out.print("  ");
                  }
            }
            System.out.println();
        }
    }
}