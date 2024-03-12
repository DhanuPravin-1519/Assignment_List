//Write a program for multi level inheritance by creating different class

package assignment_package;

public class Ab_39Assignment32 extends ParentClass2
{
void add()
{
	System.out.println("Child class add method");
}

void sub()
{
	System.out.println("Child class sub method");
}
	public static void main(String[] args)
	{

        Ab_39Assignment32 a32=new Ab_39Assignment32();
        a32.add();
        a32.sub();
        a32.add1();
        a32.sub1();
        a32.add2();
        a32.sub2();
	}

}
