import java.io.*;
import java.util.*;
import java.lang.*;
public class subset
{
 public static void main(String [] args)
 {
  int n1,n2,i,a=2,flag=0,j;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the value of n1 and n2");
  n1=s.nextInt();
  n2=s.nextInt();
  int [] arr1=new int[n1];
  int [] arr2=new int[n2];
  System.out.println("Enter the n1 elements one by one:");
  for(i=0;i<n1;i++)
  {
  arr1[i]=s.nextInt();
  }
  System.out.println("Enter the n1 elements one by one:");
  for(i=0;i<n2;i++)
  {
  arr2[i]=s.nextInt();
  }
  if(n1>=n2)
  {   
	  a=1;
  }
 
  if(a==1)
  {
	 for(i=0;i<n2;i++)
	 {
		 for(j=0;j<n1;j++)
		 {
			 if(arr2[i]==arr1[j])
			 {
				 flag=1;
				 break;
			 }
			 else
			 {
				 flag=0;
				 continue;
			 }
		 }
		 if(j==n1)
		 {
			 flag=2;
			 break;
		 }
	 }
  if(i==n2&&flag==1)
  {
	  System.out.println("Array 2 is subset of array1:");
  }	  
  else
  {
	  System.out.println("Array 2 is  not subset of array1:");
  }
  }
 }
}
