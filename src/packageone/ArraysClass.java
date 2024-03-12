//Array sorting

package packageone;

import java.util.Arrays;

public class ArraysClass 
{

	public static void main(String[] args) 
	{
		int age[]=new int[3];
		age[0]=13;
		age[1]=90;
		age[2]=4;
		age[0]=45;
		//age[3]=23;
	/*	System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]); */
	 
		Arrays.sort(age);
		for(int i=0;i<=2;i++)
		{
			System.out.println(age[i]);
		}
	}

}
