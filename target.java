import java.lang.*;
import java.io.*;
import java.util.*;
public class target
{
 public static void main(String [] args)
 {
  int n,i,tmp,j,k,target;
  String str;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the  N value  :");
  n=s.nextInt();
  int [] arr=new int[n];
  System.out.println("Enter the elements one by one");
  for(i=0;i<n;i++)
 {
  arr[i]=s.nextInt();
 }  
 System.out.println("Enter the target element...");
 target=s.nextInt();
 for(i=0;i<n;i++)
 {
	 for(j=i+1;j<n;j++)
	 {
	 if(arr[i]+arr[j]==target)
	 {
		 System.out.println(arr[i]+"+"+arr[j]+"="+target);
		 System.exit(0);
	 }
    }
 }
 if(i==n)
  System.out.println("no such elements");

 }
}
