package string;
// Print the number of alphabet used in String
public class Number_of_character 
{
  public static void main(String args[])
  {
	  String str =" My name is Sandesh Raj";
	  int count=0;
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)!=' ')
			  count++;
	  }
	  System.out.println("Total number of character present in String :"+count);
  }
}
