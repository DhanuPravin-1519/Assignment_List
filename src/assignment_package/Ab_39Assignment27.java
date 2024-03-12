/*create 5 methods for addition , subtraction , multiplication ,divison , 
modulus using scanner class with global variable */

package assignment_package;

import java.util.Scanner;

public class Ab_39Assignment27
{
  static int a;
   static int b;
  static void addition()
  {
	  int Result1= a+b;
	  System.out.println("Addition of a & b is: " +Result1);
  }
  static void substraction()
  {
	  int Result2= a-b;
	  System.out.println("Substraction of a & b is: " +Result2);
  }
  static void multiplication()
  {
	  int Result3= a*b;
	  System.out.println("Multiplication of a & b is: " +Result3);
  }
   void division()
  {
	  int Result4= a/b;
	  System.out.println("Division of a & b is: " +Result4);
  }
   void modulus()
   {
 	  int Result5= a%b;
 	  System.out.println("Modulus of a & b is: " +Result5);
   }
   
 public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b =sc.nextInt();
		addition();
		substraction();
	    multiplication();
		Ab_39Assignment27 a1= new Ab_39Assignment27();
		a1.division();
		a1.modulus();

	}

}
