import java.util.*;
import java.io.*;
import java.lang.*;
public class oddeven
{
 public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("ENTER THE VALUE:");
  int a;
  a=s.nextInt();
  if(a%2==0)
  {
	 System.out.println("NUMBER IS EVEN:");  
  }
  else
  {
	   System.out.println("NUMBER IS ODD:");
  }
 }
} 
