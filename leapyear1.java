import java.util.*;
import java.io.*;
import java.lang.*;
public class leapyear1
{
 public static void main(String [] args)
 {
  
  Scanner s=new Scanner(System.in);
  int n;
  System.out.println("ENTER THE YEAR:");
  n=s.nextInt();
  if(n%400==0 || n%4==0&&n%100!=0)
  {
   System.out.println("LEAP YEAR");
  }
  else
  {
  System.out.println(" NOT A LEAP YEAR");
  }
 }
} 
