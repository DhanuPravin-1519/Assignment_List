//write a program for constructor overloading using 10 constructors

package assignment_package;

public class Ab_39Assignment19 
{
	Ab_39Assignment19()
	{
		System.out.println("1");
	}
	
	Ab_39Assignment19(int a)
	{
		System.out.println("2");
	}
	
	Ab_39Assignment19( double d)
	{
		System.out.println("3");
	}
	
	Ab_39Assignment19(char c)
	{
		System.out.println("4");	
	}
	Ab_39Assignment19( boolean b)
	{
		System.out.println("5");
	}
	Ab_39Assignment19(int a, double b)
	{
		System.out.println("6");
	}
	Ab_39Assignment19(int a, int b)
	{
		System.out.println("7");
	}
	
	Ab_39Assignment19(double a, int b)
	{
		System.out.println("8");
	}
	Ab_39Assignment19(char a, int b)
	{
		System.out.println("9");
	}
	Ab_39Assignment19(int a, int b, int c)
	{
		System.out.println("10");
	}
	public static void main(String[] args) 
	{
	System.out.println("Main method");	
    new Ab_39Assignment19();
    new Ab_39Assignment19(1);
    new Ab_39Assignment19(1.6);
    new Ab_39Assignment19('a');
    new Ab_39Assignment19(false);
    new Ab_39Assignment19(1, 2.3);
    new Ab_39Assignment19(1,2);
    new Ab_39Assignment19(1.2,1);
    new Ab_39Assignment19('c',1);
    new Ab_39Assignment19(1,2,3);
	}

}
