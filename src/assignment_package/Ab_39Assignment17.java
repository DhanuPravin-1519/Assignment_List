//Write a program with 2 Static method,2 Non-Static method,and one Constructor

package assignment_package;

public class Ab_39Assignment17 
{
  static void add()
  {
	  System.out.println("Static add method");
  }
  
  static void sub()
  {
	  System.out.println("Static sub method");
  }
  
   void mul()
  {
	  System.out.println("Static mul method");
  }
   
   void div()
   {
 	  System.out.println("Static div method");
   }
   
   Ab_39Assignment17()
   {
	   System.out.println("Constructor");
   }
	public static void main(String[] args) 
	{
	  System.out.println("main method");
	  add();
	  sub();
	  Ab_39Assignment17 a1= new Ab_39Assignment17();
	  a1.mul();
	  a1.div();

	}

}
