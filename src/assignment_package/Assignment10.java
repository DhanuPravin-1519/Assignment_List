//WAP to create a Class with 2 static and 2 non static methods, perform add and sub in first two. Multiply and divide in last two and call in main method.

package assignment_package;

public class Assignment10
{
	static void add()
	{
		int a=10;
		int b=5;
		int result=a+b;
		System.out.println("Addition is:" +result);
	}
	static void sub()
	{
		float a=5.14f;
		int b=5;
		float result=a-b;
		System.out.println("Subtraction is:" +result);
	}

	 void mul()
	{
		double a=10.4;
		int b=5;
		double result=a*b;
		System.out.println("Multiplication is:" +result);
	}
	
	 void div()
	{
		int a=10;
		int b=5;
		int result=a/b;
		System.out.println("Division is:" +result);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		Assignment10 a1= new Assignment10();
		a1.mul();
		a1.div();

	}

}
