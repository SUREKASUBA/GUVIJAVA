import java.util.*;
import java.io.*;
import java.lang.*;
public class evenrange
{
 public static void main(String [] args)
 {
	 int i,sum=0,x,n1,n2;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the n1 and n2 value");
	 n1=s.nextInt();
	 n2=s.nextInt();
	 for(i=n1;i<=n2;i++)
	 {
	  if(i%2==0)
	  System.out.println(i);

	  }
   }
} 
