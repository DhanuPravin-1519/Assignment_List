//Write a program for Hierarchical level inheritance with 2 child classes by creating different class

package assignment_package;

public class Ab_39Assignment33  extends Assignment33_heiraricalparentClass
{
 void add()
 {
	 System.out.println("Child1 add method");
 }
 
 void sub()
 {
	 System.out.println("Child1 sub method");
 }
	public static void main(String[] args)
	{
		Ab_39Assignment33 a33=new Ab_39Assignment33();
		a33.add();
		a33.sub();
		a33.parent_add();
		parent_sub();

	}

}
