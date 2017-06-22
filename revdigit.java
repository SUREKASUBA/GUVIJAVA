import java.util.*;
 
class revdigit
{
   public static void main(String args[])
   {
      int n,i,x,rev=0;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a number");
      n= in.nextInt();
	  while(n!=0)
	  {
	   x=n%10;
	   rev=rev*10+x;
	   n=n/10;
	  }
      
 
      System.out.println("FACCTORIAL VALUE IS:"+rev);
   }
}
