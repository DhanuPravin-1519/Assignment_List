//Find the area and circumference of the circle,triangle,square,rectangle & trapezium using scanner class

package assignment_package;

import java.util.Scanner;

public class Ab_39Assignment30_Circumference 
{
	final static double pi=3.14;
	static void circumferenceofcircle()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter radious");
		 double r=sc.nextDouble();
		 double circle_circumference= 2*pi*r;
		 System.out.println("circumference of circle is: "+ circle_circumference);		 
	 }
	static void circumferenceoftriangle()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter side1");
		 double a=sc.nextDouble();
		 System.out.println("enter side2");
		 double b=sc.nextDouble();
		 System.out.println("enter side3");
		 double c=sc.nextDouble();
		 double circle_circumference= a+b+c;
		 System.out.println("circumference of triangle is: "+ circle_circumference);		 
	 }
	
	static void circumferenceof_Rectangle()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter length");
		 double l=sc.nextDouble();
		 System.out.println("enter width");
		 double w=sc.nextDouble();	
		 double circum_Rectangle= 2*(l+w);
		 System.out.println("circumference of rectangle is: "+ circum_Rectangle);
	}
	static void circum_ofsquare()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter side");
		 double side=sc.nextDouble();
		 double circum_square= 2*side;
		 System.out.println("circumference of square is: "+ circum_square);
	}
	static void circum_ofstrapezium()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side1");
		double a=sc.nextDouble();
		 System.out.println("enter side2");
		 double b=sc.nextDouble();
		 System.out.println("enter side3");
		 double c=sc.nextDouble();
		 System.out.println("enter side4");
		 double d=sc.nextDouble();
		 double circum_trapezium=(a*b)+(b*c)+(c*d)+(a*d);
		 System.out.println("circumference of trapezium is: "+ circum_trapezium);
	}
	public static void main(String[] args) 
	{
		
		circumferenceofcircle();
		circumferenceoftriangle();
		circumferenceof_Rectangle();
		circum_ofsquare();
		circum_ofstrapezium();

	}

}
