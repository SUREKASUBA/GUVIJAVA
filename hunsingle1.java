import java.util.*;
import java.io.*;
import java.lang.*;
public class hunsingle1
{
 public static void main(String [] args)
 {
 int n,i,j,flag=0,single=0;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the value of n:");
 n=s.nextInt();
 int[] arr=new int[n];
  System.out.println("Enter the elements one by one of n:");
 for(i=0;i<n;i++)
 {
  arr[i]=s.nextInt();
 }

 for(i=0;i<n-1;i++)
  {
 	for(j=i+1;j<n;j++)
 	{
 	 if(arr[i]==arr[j])
	 {
		 arr[j]=1234;
		 flag=1;
		 break;
	 }
	 else
	 {
		 flag=0;
	 }
	}
	if(flag==1)
	{
		continue;
	}
	else if(arr[i]!=1234)
	{
	single=arr[i];
   }
  }
  System.out.println("THE SINGLE IS:"+single);
 }
}
