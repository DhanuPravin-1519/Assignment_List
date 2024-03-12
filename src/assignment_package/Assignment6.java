//Write many non static method and call it inside the main method

package assignment_package;

public class Assignment6 
{
	void add()
	{
		System.out.println("This is non-static addition method block");
	}
	void sub()
	{
		System.out.println("This is non-static subtraction method block");
	}
	void mul()
	{
		System.out.println("This is non-static multipliction method block");
	}
	void div()
	{
		System.out.println("This is non-static division method block");
	}

	public static void main(String[] args) 
	{
		
   System.out.println("Following are the bon-static methods");
	Assignment6 a6=new Assignment6();
	a6.add();
	a6.sub();
	a6.mul();
	a6.div();

	}

}
