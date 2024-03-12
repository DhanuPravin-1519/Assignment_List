//Write a program using for loop that starts from 1 to 10 and find out its average?

package assignment_package;

public class Ab_39Assignment28 
{

	public static void main(String[] args) 
	{ double sum=0;
		double average;
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
	     sum=sum+i;
	    
		}
		System.out.println("sum of 1 -10 is: " +sum);

		average=sum/10;
		System.out.println("Average of 1 -10 is: " +average);
	}

}
