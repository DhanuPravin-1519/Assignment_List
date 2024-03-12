/* Write a program to check if gender equals to male or female.If it is male and check if age is greater than 18 or not.if it is greater than
18 then the person is eligible to vote otherwise not eligible to vote.If it is female and check if age is greater than 18 or not.If the age
is greater than 18 then the person is eligible to vote otherwise not eligible to vote */

package assignment_package;

public class Ab_39Assignment16 
{

	public static void main(String[] args) 
	{
	int age=19;
    String gender= "Male";
    if (gender=="Male") 
    {
	  if (age>18) 
	  {
		System.out.println("He is eligible to vote");
	  }	
	  else 
	  {
		System.out.println("He is not eligible to vote");
	  }
	} else 
	{
      if (gender=="female") 
      {
		if (age>18)
		{
			System.out.println("She is eligible to vote");
		}
		else 
		{
		System.out.println("She is not eligible to vote");
		}
	} 
	}

	}

}
