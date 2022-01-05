package string;
import java.util.Scanner;
public class Removing_vowel 
{
   public static void main(String args[])
   {
	   Scanner s= new Scanner(System.in);
	   System.out.println("Enter the String :");
	   String str=s.nextLine();
	   String str1="";
	   str1=str.replaceAll("[aeiou]","");
	   System.out.println("Removing vowel from the String :"+str1);
	   s.close();
   }
}
