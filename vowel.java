import java.util.*;
import java.io.*;
import java.lang.*;
public class vowel
{
 public static void main(String [] args)
 {
  char c;
  Scanner s=new Scanner(System.in);
  System.out.println("ENTER THE Character:");
  c=(char)s.next().charAt(0);
  if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
  {
  System.out.println("CHARACTER IS VOWEL:");
  }
  else
  {
  System.out.println("CHARACTER IS CONSONANTS:");
  }
 } 
}
