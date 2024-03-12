//Create few constructor and call it in main method

package assignment_package;

public class Assignment8 
{
 Assignment8()
 {
	 System.out.println("Constructor 1");
 }
  
 Assignment8(int a)
 {
	 System.out.println("Constructor 2");
 }
 
 Assignment8(double b)
 {
	 System.out.println("Constructor 3");
 }
 
 Assignment8(double b, int a)
 {
	 System.out.println("Constructor 4");
 }
 
	public static void main(String[] args)
	{
	 System.out.println("Following are the parameterized constructors");

	 new Assignment8();
	 new Assignment8(10);
	 new Assignment8(3.14);
	}

}
