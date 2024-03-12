/*create 5 methods for addition , subtraction , multiplication ,divison , 
modulus using 5 scanner class with local  variables*/

package assignment_package;

import java.util.Scanner;

public class Ab_39Assignment29 
{
	
	static void add()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		int Result1=a+b;
		System.out.println("Addition of a & b is: "+ Result1);	
	}
	
	static void sub()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		int Result2=a-b;
		System.out.println("Substraction of a & b is: "+ Result2);	
	}
	static void mul()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		int Result3=a*b;
		System.out.println("Addition of a & b is: "+ Result3);	
	}
	static void div()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		int Result4=a/b;
		System.out.println("Division of a & b is: "+ Result4);	
	}
	static void mod()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		int Result5=a%b;
		System.out.println("Modulus of a & b is: "+ Result5);	
	}
	
 public static void main(String[] args) 
 {
	 add();
	 sub();
	 mul();
	 div();
	 mod();
	
}
}
