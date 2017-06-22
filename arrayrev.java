import java.io.*;
import java.util.*;
import java.lang.*;
public class array
{
 public static void main(String [] args)
 {
 int n,i,k,temp,j;
 Scanner s=new Scanner(System.in);
 System.out.println("ENTER THE N VALUE:");
 n=s.nextInt();
 int arr[]=new int[n];
 for(i=0;i<n;i++)
 {
   arr[i]=s.nextInt();
 }
  System.out.println(" THE ELEMENTS:");
  for(i=0;i<n;i++)
  {
  System.out.println(arr[i]);
  }
  System.out.println("Enter the k value:");
  k=s.nextInt();
  for(i=0;i<k;i++)
  {
	  temp=arr[n-1];
	  for(j=n-2;j>=0;j--)
	  {
		  arr[j+1]=arr[j];
	  }
	  arr[0]=temp;
	  
  }
for(i=0;i<n;i++)
 {
 System.out.println(arr[i]);
 }
}
}
