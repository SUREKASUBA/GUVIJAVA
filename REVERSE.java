import java.util.*;
 
class REVERSE
{
   public static void main(String args[])
   {
      String st, rev = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      st = in.nextLine();
 
      int len = st.length();
 
      for ( int i = len - 1 ; i >= 0 ; i-- )
         rev = rev + st.charAt(i);
 
      System.out.println("Reverse of entered string is: "+rev);
   }
}
