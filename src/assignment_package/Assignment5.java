//Write a non static method and call it inside the main method

package assignment_package;

public class Assignment5 
{
	void add()
	{
		System.out.println("This is non-static method");
	}

	public static void main(String[] args) 
	{
		System.out.println("Calling the non-static method");
		Assignment5 a1=new Assignment5();
		a1.add();
	}

}
