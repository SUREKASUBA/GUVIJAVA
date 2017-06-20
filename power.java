import java.util.*;
import java.io.*;
import java.lang.*;
public class power
{
 public static void main(String [] args)
 {
 Scanner s=new Scanner(System.in);
 int base,pow,i,b;
 System.out.println("ENTER THE BASE VALUE:");
 base=s.nextInt();
 System.out.println("ENTER THE POWER VALUE:");
 pow=s.nextInt();
 if(pow==0)
 {
  System.out.println("THE POWER VALUE IS:1");
 }
 else if(base==0)
 {
  System.out.println("THE POWER VALUE IS:0");
 }
  else if(pow==1)
 {
  System.out.println("THE POWER VALUE IS:"+base);
 }
  else if(base==1)
 {
  System.out.println("THE POWER VALUE IS:1");
 }
 else
 {
  b=1;
  for(i=1;i<=pow;i++)
  {
   b=b*base;
  }
  System.out.println("THE POWER VALUE IS:"+b);
 }
 
 }
}
