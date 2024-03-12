//write a program to check whether the given string is palindrome or not

package assignment_package;

public class Ab_39Assignment41 
{

	public static void main(String[] args) 
	{
		String name="mom";
		String reverse=" ";
		for(int i=name.length()-1;i>=0;i--)
		{
			char answer=name.charAt(i);
			reverse=reverse+answer;
		}
		System.out.println(reverse);
		
     if (name==reverse)
     {
	System.out.println("Given string is palindrome");	
	}
     else 
     {
    	 System.out.println("Given string is not palindrome");	
	 }
	}

}
