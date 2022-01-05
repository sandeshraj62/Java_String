package string;
import java.util.Scanner;
// check whether the string is Palindrome or not
public class String_Palindrome
{
  public static void main(String args[])
  {
	  Scanner s= new Scanner(System.in);
	  System.out.println("Enter the String :");
	  String str=s.nextLine();
	  String rev="";
	  for(int i=str.length()-1;i>=0;i--)
	  {
		  rev=rev+str.charAt(i);
	  }
	  if(str.equals(rev))
	  {
		  System.out.println("String is Palindrome");
	  }else
	  {
		  System.out.println("String is not A palindrome");
	  }
	  s.close();
	  
  }
}
