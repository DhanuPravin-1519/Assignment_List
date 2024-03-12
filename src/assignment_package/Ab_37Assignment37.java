//write a program using abstract class,abstract method ,concrete class and concrete method?

package assignment_package;

abstract class Parent_class
{
	abstract void add();
	
	static void sub()
	{
		System.out.println("Abstract class concrete method1");
	}
	
	void mul()
	{
		System.out.println("Abstract class concrete method2");
	}
}

public class Ab_37Assignment37 extends Parent_class
{
	void add()
	{
		System.out.println("Concrete method");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		Ab_37Assignment37 a37=new Ab_37Assignment37();
		a37.add();
        sub();
        a37.mul();
	}

}
