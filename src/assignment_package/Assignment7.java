//Create one constructor and call it in main method

package assignment_package;

public class Assignment7 
{
  Assignment7()
  {
	 System.out.println("This is constructor"); 
  }
	public static void main(String[] args) 
	{
		System.out.println("Constructor calling");
		//Assignemnt7 a7=new Assignment7(); // 1st way to call constructor
		//a7.Assignment7
		new Assignment7();// 2nd way to call constructor

	}

}
