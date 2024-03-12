package assignment_package;

class parent
{
 void add()
 {
	 System.out.println("Parent class method");
 }
}
public class Ab_39Assignment31 extends parent
{
	void sub()
	{
		System.out.println("child class method");
	}
	public static void main(String[] args) 
	{
		
		Ab_39Assignment31 a31=new Ab_39Assignment31();
		a31.add();
        a31.sub();
	}

}
