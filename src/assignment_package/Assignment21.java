//WAP with 3 methods main,static add and static subtract. Declare and initialize a and b global variables as non- static in nature and then perform addition and subtraction with static methods

package assignment_package;

public class Assignment21
{
	 int a=10;
	 int b=5;
	 static void add()
	 {
	    int Sum=a+b;
	 	System.out.println("Addition of 2 number is:" + Sum);
	 			
	 }
	 
	 static void sub()
	 {
	    int Result=a-b;
	 	System.out.println("Addition of 2 number is:" + Result);
	 			
	 }

	public static void main(String[] args)
	{
		Assignment21 a21=new Assignment21();
		

	}

}
