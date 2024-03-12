/*write a program using this keyword to assign the value of a LV(local variable) 
to GV(global variable)*/

package assignment_package;

public class Ab_39Assignment36 
{
 int salary;
 void add()
 {
	 int salary=100000;
	 this.salary=salary;
	 
 }
	public static void main(String[] args) 
	{
		Ab_39Assignment36 a36=new Ab_39Assignment36();
		a36.add();
		System.out.println(a36.salary);

	}

}
