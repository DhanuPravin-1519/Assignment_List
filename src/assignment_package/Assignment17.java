//WAP with 4 constructors and 1 IIB

package assignment_package;

public class Assignment17 
{
 Assignment17()
 {
	 System.out.println("Constructor 1");
 }
 
 Assignment17(int a)
 {
	 System.out.println("Constructor 2");
 }
 
 Assignment17(double a)
 {
	 System.out.println("Constructor 3");
 }
 
 Assignment17(int a, double b)
 {
	 System.out.println("Constructor 4");
 }
 
 {
	 System.out.println("IIB");
 }
	public static void main(String[] args) 
	{
	
    System.out.println("Main mthod");
    
    new Assignment17();
    new Assignment17(10);
    new Assignment17(3.14);
    new Assignment17(10,3.33);
    
    
    
	}

}
