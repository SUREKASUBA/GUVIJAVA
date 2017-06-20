import java.util.*;
import java.io.*;
import java.lang.*;
public class sum
{
 public static void main(String [] args)
 {
	 int i,sum=0,n;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the n value");
	 n=s.nextInt();
     for(i=1;i<=n;i++)
     {
	  sum=sum+i;
     }
  System.out.println("Sum is:"+sum);
 }
} 
