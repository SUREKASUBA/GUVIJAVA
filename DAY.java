import java.util.*;
 
class day
{
   public static void main(String args[])
   {
      int n,i,fact=1;
	  String day;
      Scanner s = new Scanner(System.in);
 
      System.out.println("Enter a DAY:");
      day=(s.nextLine()).toLowerCase();
	  if(day.equals("sunday"))//||"tuesday"||"wednesday"||"thursday"||"friday")
      {
	   System.out.println("It is not a Working day:");
	  }	  
      else
      {
	  System.out.println("It is  a working day:");
	  }
   }
}
