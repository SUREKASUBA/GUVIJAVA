import java.util.*;
 
class arrayrepeat
{
   public static void main(String args[])
   {
      int n,n2,i,flag=0,j,r=0;
	  Scanner s = new Scanner(System.in);
      System.out.println("Enter the n value: ");
	  n=s.nextInt();
	  int[] arr=new int[n];
	  System.out.println("Enter the elements: ");
	  for(i=0;i<n;i++)
	  {
	  arr[i]=s.nextInt();
	  }
	  for(i=0;i<n;i++)
	  {
	  for(j=i+1;j<n;j++)
	  {
	   if(arr[i]==arr[j])
	   {
		r=arr[i];
	    flag=1;
	    break;
	   }
	  
	  }if(flag==1)
	  {
	  break;
	  }
	 }
    
  System.out.println("REPEATED ELEMENT IS:"+r);
}
 }
