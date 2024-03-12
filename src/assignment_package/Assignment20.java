//WAP with 3 methods main,static add and static subtract. Declare a and b as static global variables and initialize then in each method and perform addition and subtraction

package assignment_package;

public class Assignment20
{
static int a;
static int b;

static void add()
{
	a=10;
	b=11;
	int Sum=a+b;
	System.out.println("Addition of 2 number is:" + Sum);
			
}

static void sub()
{
	a=55;
	b=11;
	int Result=a-b;
	System.out.println("Subtraction of 2 number is:" + Result);
			
}

	public static void main(String[] args)
	{
		
      System.out.println("Global variable usage");
      add();
      sub();
	}

}
