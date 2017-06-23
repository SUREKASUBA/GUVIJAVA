import java.lang.*;
import java.io.*;
import java.util.*;
public class largestfour
{
 public static void main(String [] args)
 {
  int n,i,tmp,j,k;
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
 //System.out.println("Swap ..":");
 for(i=0;i<n;i++)
 {
	 for(j=i+1;j<n;j++)
	 {
	 if(arr[i]<arr[j])
	 {
		 tmp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=tmp;
	 }
    }
 }
 System.out.println("elements after swapping are:");
	 System.out.println(arr[3]);
 System.out.println("Enter the K value:");
 k=s.nextInt();
 System.out.println(arr[k-1]);
 }
}
