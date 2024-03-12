package typecasting;

class Parent_Class
{
void add()
{
	System.out.println("Addition");
}
}
public class Example2 extends Parent_Class
{
void sub()
{
	System.out.println("Substraction");
}
	public static void main(String[] args)
	{
		
		Parent_Class pc1  =new Example2(); //upcasting
		pc1.add();
		
	}

}
