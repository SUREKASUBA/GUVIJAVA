import java.util.*;
import java.io.*;
import java.lang.*;
public class noofdigit
{
 public static void main(String [] args)
 {
	 int i,sum=0,x,n,cnt=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the n value");
	 n=s.nextInt();
	 while(n!=0)
	 {
	 cnt++;
	 n=n/10;
	 }
  System.out.println("Number Of Digits is:"+cnt);
 }
} 
