import java.util.*;
import java.io.*;
import java.lang.*;
public class sumloop
{
 public static void main(String [] args)
 {
	 int i,sum=0,x,n;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the n value");
	 n=s.nextInt();
	  for(i=1;i<=n;i++)
     {
	  x=s.nextInt();
	  sum=sum+x;
     }
  System.out.println("Sum is:"+sum);
 }
} 
