package string;
// Print the number of vowel and consonant present in the String
public class Vowel_Consonant
{
  public static void main(String args[])
  {
	  String str=" This is Sandesh Raj from Dhanbad Jharkhand";
	  str=str.toLowerCase();
	  int vCount=0,cCount=0;
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)=='a'||str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		  {
			  vCount++;
		  }
		  else if(str.charAt(i)>'a' && str.charAt(i)<'z')
		  {
			  cCount++;
		  }
	  }
	  System.out.println("Number of Vowel present in the String is: "+vCount);
	  System.out.println("Number of Consonant present in the String is: "+cCount);
	  
	  
  }
}
