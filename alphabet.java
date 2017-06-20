import java.util.*;
import java.io.*;
import java.lang.*;
public class alphabet
{
 public static void main(String [] args)
 {
  char c;
  Scanner s=new Scanner(System.in);
  System.out.println("ENTER THE Character:");
  c=(char)s.next().charAt(0);
  if(c>='A' && c<='Z' || c>='a' && c<='z')
  {
   System.out.println("THE CHARACTER IS ALPHABAT:");
  }
  else
  {
   System.out.println("THE CHARACTER IS NOT  ALPHABAT:");
  }
  }
}
