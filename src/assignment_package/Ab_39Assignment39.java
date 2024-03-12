//write a program for multiple level inheritance with 4 parents  using interface?

package assignment_package;

interface Parent1
{
	void add1();
	void sub1();
}
interface Parent2
{
	void add2();
	void sub2();
}
interface Parent3
{
	void add3();
	void sub3();
}
interface Parent4
{
	void add4();
	void sub4();
}

public class Ab_39Assignment39 implements Parent1,Parent2,Parent3, Parent4
{

	public static void main(String[] args) 
	{
		Ab_39Assignment39 a39= new Ab_39Assignment39();
        a39.add1();
        a39.add2();
        a39.add3();
        a39.add4();
        a39.sub1();
        a39.sub2();
        a39.sub3();
        a39.sub4();
	}

	public void add4() 
	{
		System.out.println("Add4 method");
		
	}
	public void sub4() 
	{
		System.out.println("Sub4 method");
		
	}

	public void add3()
	{
		System.out.println("Add3 method");	
		
	}

	public void sub3() 
	{
	
		System.out.println("Sub3 method");
	}

	public void add2() 
	{
		System.out.println("Add2 method");
		
	}

	public void sub2() 
	{
		System.out.println("Add2 method");
		
	}

	public void add1() 
	{
		System.out.println("Add1 method");
		
	}

	public void sub1() 
	{
		System.out.println("Sub1 method");
		
	}

}
