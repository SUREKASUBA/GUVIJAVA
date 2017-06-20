import java.util.*;
import java.io.*;
import java.lang.*;
public class largest
{
 public static void main(String [] args)
 {
  int c,a,b;
  Scanner s=new Scanner(System.in);
  System.out.println("ENTER THE NUMBERS:");
  a=s.nextInt();
  b=s.nextInt();
  c=s.nextInt();
  if(a>b &&a>c)
  {
  System.out.println("A IS LARGEST:"+a);
  }
  else if(b>c && b>a)
  {
    System.out.println("B IS LARGEST:"+b);
  }
  else
  {
    System.out.println("C IS LARGEST:"+c);
  }
  }
}
