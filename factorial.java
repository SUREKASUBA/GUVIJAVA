import java.util.*;
 
class factorial
{
   public static void main(String args[])
   {
      int n,i,fact=1;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a number");
      n= in.nextInt();
      for(i=1;i<=n;i++)
	  {
	  fact=fact*i;
	  }
      
 
      System.out.println("FACCTORIAL VALUE IS:"+fact);
   }
}
