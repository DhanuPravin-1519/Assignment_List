//Create an array of length 3 of int data type and add its value at the runtime

package assignment_package;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ab_39Assignment44 
{

	public static void main(String[] args)
	{
		int project_no[]=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=2;i++)
		{
			System.out.println("Enter project_no");
			project_no[i]=sc.nextInt(); 
		}
		Arrays.sort(project_no);
		System.out.println(Arrays.toString(project_no));
		
		System.out.println("size if an array is: "+Array.getLength(project_no));

	}

}
