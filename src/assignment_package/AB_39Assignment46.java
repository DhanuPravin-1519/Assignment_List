//Check any 2 strings are anagram or not

package assignment_package;

import java.util.Arrays;

public class AB_39Assignment46 
{

	public static void main(String[] args) 
	{
		String name1="night";
		String name2="thing";
		if (name1.length()!=name2.length()) 
		{
		  System.out.println("Given String are not anagram");	
		}
		else
		{
		char a[]=name1.toCharArray();
		char b[]=name2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	    boolean answer=Arrays.equals(a, b);	
        System.out.println(answer);
        if(answer==true)
        {
        	System.out.println("Given string are of anagram");
        }
        else
        {
        	System.out.println("Given string are not of anagram");	
        }
		}
	}

}
