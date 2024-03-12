//"Write a program to find Area of Circle,Triangle,Rectangle,Square,Trapezium

package assignment_package;

public class Ab_39Assignment22 
{
 static void areaofcircle()
 {
	 double pi=3.14;
	 int r=2;
	 double circle_area= pi*r*r;
	 System.out.println("Area of circle is: "+ circle_area);
			 
 }
 static void areaoftriangle()
 {
	 int height=10;
	 int base=2;
	 double triangle_area=(height*base)/2;
	 System.out.println("Area of triangle is: " +triangle_area);
 }
 static void areaofrectangle()
 {
	 int length=11;
	 double width=4.5;
	 double rectangle_area= length*width;
	System.out.println("Area of rectangle is: " +rectangle_area);
 }
 static void areaofsquare()
 {
	 int side=5;
	 int square_area= side*side;
	System.out.println("Area of square is: " +square_area); 
 }
 static void areaoftrapezium()
 {
	 int base1=11;
	 double base2=4.5;
	 int height= 2;
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
