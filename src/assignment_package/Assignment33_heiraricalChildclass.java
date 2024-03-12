//Write a program for Hierarchical level inheritance with 2 child classes by creating different class

package assignment_package;

public class Assignment33_heiraricalChildclass extends Assignment33_heiraricalparentClass
{
void add1()
{
	System.out.println("Child2 add method");
}
void sub1()
{
	System.out.println("Child2 sub method");
}
	public static void main(String[] args) 
	{
		Assignment33_heiraricalChildclass a33child2=new Assignment33_heiraricalChildclass();
		a33child2.add1();
		a33child2.sub1();
		a33child2.parent_add();
        parent_sub();
	}

}
