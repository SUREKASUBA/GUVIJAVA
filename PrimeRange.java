import java.util.*;
 
class primeran
{
   public static void main(String args[])
   {
      int n1,n2,i,fact=1,j;
      Scanner s = new Scanner(System.in);
 
      System.out.println("Enter a Prime number Range:");
	  n1=s.nextInt();
	  n2=s.nextInt();
	  for(j=n1;j<=n2;j++)
	  {
		for(i=2;i<=(j/2);i++)
	  {
	   if(j%i==0)
	   {	
         break;
	  }
	  }
	   if(i==(j/2)+1)
	   {
	   System.out.println("PRIME NUMBERS ARE:"+j);
	   }
     }
}}
