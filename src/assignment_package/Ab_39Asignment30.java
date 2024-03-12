//Find the area and circumference of the circle,triangle,square,rectangle & trapezium using scanner class
package assignment_package;

import java.util.Scanner;

public class Ab_39Asignment30
{
 final static double pi=3.14;
	static void areaofcircle()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter radious");
		 double r=sc.nextDouble();
		 double circle_area= pi*r*r;
		 System.out.println("Area of circle is: "+ circle_area);
				 
	 }
	 static void areaoftriangle()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter height");
		 double height= sc.nextDouble();
		 System.out.println("Enter base");
		 double base=sc.nextDouble();
		 double triangle_area=(height*base)/2;
		 System.out.println("Area of triangle is: " +triangle_area);
	 }
	 static void areaofrectangle()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter length");
		 double length= sc.nextDouble();
		 System.out.println("Enter width");
		 double width=sc.nextDouble(); 
		 double rectangle_area= length*width;
		System.out.println("Area of rectangle is: " +rectangle_area);
	 }
	 static void areaofsquare()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter side");
		 double side= sc.nextDouble();
		 double square_area= side*side;
		System.out.println("Area of square is: " +square_area); 
	 }
	 static void areaoftrapezium()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter base1");
		 double base1= sc.nextDouble();
		 System.out.println("Enter base2");
		 double base2=sc.nextDouble();
		 System.out.println("Enter height");
		 double height=sc.nextDouble();
		 double trapezium_area=(base1+base2)/2*height;
		System.out.println("Area of trapezium is: " +trapezium_area);
	 }
	public static void main(String[] args) 
	{
		areaofcircle();
		areaoftriangle();
		areaofrectangle();
		areaofsquare();
		areaoftrapezium();

	}

}
