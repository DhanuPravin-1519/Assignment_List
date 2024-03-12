//WAP where in a class, there are 5 methods(3static, 2non static) with same name....first method argument is int a, second method argument is double a,third method argument is char a, fourth method argument is boolean a and fifth method argument is String a

package assignment_package;

public class Assignment11 
{
 static void add(int a)
 {
	System.out.println("static method 1"); 
 }
	
 static void add(double a)
 {
	 System.out.println("static method 2"); 
 }
 
 static void add(char a)
 {
	 System.out.println("static method 3");  
 }
 
 void add(boolean a)
 {
	 System.out.println("non-static method 1"); 
 }
 
 void add(String a)
 {
	 System.out.println("non-static method 2");  
 }
	
	public static void main(String[] args) 
	
	{
		
System.out.println("Method overloading:");
add(10);
add(1.12);
add('c');
Assignment11 a1=new Assignment11();
a1.add(false);
a1.add("Dhruv");
	}

}
