package packageone;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter value");
	   int a=sc.nextInt();
	   int Result=1;
	    for(int i=1;i<=a;i++ )
	    {
	      Result=Result*i;
	   
	    }
	    System.out.println(Result);
	}

}