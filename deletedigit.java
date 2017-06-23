import java.lang.*;
import java.io.*;
import java.util.*;
public class deletedigit
{
 public static void main(String [] args)
 {
  int n,i=0,size,tmp,j,k,target,d,res,len;
  String str;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the  N value  :");
  n=s.nextInt();
  int [] arr=new int[n];
  //System.out.println("Enter the elements one by one");
  while(n!=0)
 {
  arr[i++]=n%10;
  n=n/10;
 }  
 size=i;
 //System.out.println("Enter the target element...");
 //target=s.nextInt();
 for(i=0;i<size;i++)
 {
	 for(j=i+1;j<size;j++)
	 {
	 if(arr[i]>arr[j])
	 {
		 tmp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=tmp;
	 }
    }
 }
 //if(i==n)
  System.out.println("The Elements are:");
  for(i=0;i<size;i++)
  {
	  System.out.println(arr[i]);
  }
  len=arr.length;
  System.out.println("Array length is:"+len);
  System.out.println("Enter the number of element to be deleted:");
  d=s.nextInt();
  res=size-d;
 System.out.println("Result is:"+res);
 for(i=0;i<res;i++)
 {
	 System.out.print(arr[i]);
 }
 }
}
