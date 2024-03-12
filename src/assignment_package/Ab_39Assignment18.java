// Write a program with 4 Static method and 4 Non-Static method make sure all have same name //
package assignment_package;

public class Ab_39Assignment18 
{
	static void add()
	{
		System.out.println("1");
	}
	
	static void add(int a)
	{
		System.out.println("2");
	}

	static void add(double a)
	{
		System.out.println("3");	
	}
	static void add(int a, double b)
	{
		System.out.println("4");
	}
	 void add(int a, char c)
	{
		 System.out.println("5");
	}
	void add(char a)
		{
		System.out.println("6");
		}
   void add(int a, int b)
		{
	   System.out.println("7");
		}
   
   void add(char a, int b)
	{
	   System.out.println("8");
	}
	public static void main(String[] args) 
	{
	System.out.println("Main method");
    add();
    add(5);
    add(1.1);
    add(1, 1.2);
    Ab_39Assignment18  a1= new Ab_39Assignment18 ();
    a1.add(1, 's');
    a1.add('s');	
    a1.add(1, 2);
    a1.add('c', 4);
	}

}
