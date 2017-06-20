import java.util.*;
import java.io.*;
import java.lang.*;
public class character
{
 public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  int a,n,b,c,i,charcount=0,wordcount=0,others=0;
  String line;
  System.out.println("ENTER THE LINE:");
  line=s.nextLine();
  for(i=0;i!=line.length();i++)
  {
	  if(line.charAt(i)>='A' && line.charAt(i)<='Z')
		  charcount++;
	  else if(line.charAt(i)>='a' && line.charAt(i)<='z')
		  charcount++;
	  else if(line.charAt(i)>='0' && line.charAt(i)<='9')
		  wordcount++;
	  else 
		  others++;
  }
   System.out.println("NO OF CAHRECTERS IN A LINE IS:"+charcount);
   System.out.println("NO OF DIGITS IN A LINE IS:"+wordcount);
   System.out.println("NO OF OTHERS IN A LINE IS:"+others);
  }
 }
