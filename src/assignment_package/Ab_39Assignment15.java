//How to call non-static method inside a main method

package assignment_package;

public class Ab_39Assignment15 
{
	void add()
	{
		System.out.println("addition block");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		Ab_39Assignment15 a1=new Ab_39Assignment15();
		a1.add();
				

	}

}
