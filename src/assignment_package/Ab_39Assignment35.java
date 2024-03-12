//Write a program for method overriding 

package assignment_package;
class Parent_mtdOverridden
{
	void mtd_add()
	{
		System.out.println("method1");
	}
}

public class Ab_39Assignment35 extends Parent_mtdOverridden
{

	void mtd_add()
	{
		super.mtd_add();
		System.out.println("method2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		Ab_39Assignment35 a35=new Ab_39Assignment35();
		a35.mtd_add();
		

	}

}
