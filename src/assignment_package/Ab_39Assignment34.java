//Write a program to call the parent class constructor using super calling statement

package assignment_package;
 class ParentConstructor
 {
	 ParentConstructor()
	 {
		System.out.println("Calling parent class constructor"); 
	 }
 }

public class Ab_39Assignment34 extends ParentConstructor
{
	Ab_39Assignment34()
	{
		super();
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("This is main method");
		Ab_39Assignment34 a34=new Ab_39Assignment34();
		
	}

}
