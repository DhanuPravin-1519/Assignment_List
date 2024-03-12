//WAP with combination of SIB, IIB, main method, constructor

package assignment_package;

public class Assignment15 
{
static
{
	System.out.println("SIB");
}

{
	System.out.println("IIB");
}

Assignment15()
{
	System.out.println("Constructor 1");
}
Assignment15(int a)
{
	System.out.println("Constructor 2");
}
	public static void main(String[] args)
	{
		
		System.out.println("Main method");
		new Assignment15();
		new Assignment15(11);
		
	}

}
