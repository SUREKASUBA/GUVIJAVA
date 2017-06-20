import java.util.*;
import java.io.*;
import java.lang.*;
public class fib
{
 public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  int a,n,b,c,i;
  System.out.println("ENTER THE NUMBER:");
  n=s.nextInt();
  a=0;
  b=1;
  System.out.println(a);
  System.out.println(b);
  for(i=1;i<=n;i++)
  {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
  }
 }
} 
