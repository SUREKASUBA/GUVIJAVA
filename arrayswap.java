import java.lang.*;
import java.io.*;
import java.util.*;
public class arrayswap
{
 public static void main(String [] args)
 {
  int n,i;
  String str,tmp="";
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the line:");
  str=s.nextLine();
  String [] arr=str.split(" ");
  n=arr.length;
  //int [] arr=new int[n];
  System.out.println(n);
  for(i=0;i<n/2;i++)
  {
	  tmp=arr[i];
	  arr[i]=arr[n-i-1];
	  arr[n-i-1]=tmp;
  }
  for(i=0;i<n;i++)
  System.out.print(arr[i]+" ");
 }
}
