import java.util.*;
import java.io.*;
import java.lang.*;
public class oddevenswap
{
  public static void main(String[] args) 
  {
  StringBuilder a;
  int i;
  char temp;
   Scanner s=new Scanner(System.in);
   System.out.println("ENTER THE STRING:");
   a=new StringBuilder(s.nextLine());
   System.out.println("STRING IS:"+a);
   if(a.length()%2==0)
   {
   for(i=0;i<a.length();i=i+2)
   {
	temp=a.charAt(i+1);
    a.setCharAt(i+1,a.charAt(i));
    a.setCharAt(i,temp);	
   }
   }
   else
   {
	   for(i=0;i<a.length()-1;i=i+2)
	   {
        temp=a.charAt(i+1);
        a.setCharAt(i+1,a.charAt(i));
        a.setCharAt(i,temp);	 
		   
	   }
   }
   System.out.println(a);
  }  
}
