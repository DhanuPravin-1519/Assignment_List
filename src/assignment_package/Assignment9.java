//WAP to perform substraction, multiplication.division of two number

package assignment_package;

public class Assignment9
{
	static void sub()
	{
		int a=10;
		int b=5;
		int result=a-b;
		System.out.println("Subtraction is:" +result);
	}

	static void mul()
	{
		int a=10;
		int b=5;
		int result=a*b;
		System.out.println("Multiplication is:" +result);
	}
	
	static void div()
	{
		int a=10;
		int b=5;
		int result=a/b;
		System.out.println("Division is:" +result);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Arithmatic operations");
		sub();
		mul();
		div();
		
		

	}

}
