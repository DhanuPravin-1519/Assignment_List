package packageone;

public class StringFunction
{

	public static void main(String[] args) 
	{
		String name= "dhruv";
		String name2= "DHRUV";
		String name1="Student123";
		//length of string
		System.out.println(name.length());
		//to uppercase
		String d1=name.toUpperCase();
		System.out.println(d1);
		//lo lowercase
		System.out.println(name2.toLowerCase());
		// char At(index)
		System.out.println(name.charAt(2));
		//Trimming
		String Sap="  Pravin ";
		System.out.println(Sap);
		System.out.println(Sap.length());
		System.out.println(Sap.trim());
		//Concat
		System.out.println(name2.concat(Sap));
		//remove numeric data
         String a1=name1.replaceAll("[0-9]", "");
         System.out.println(a1);
         //replace all the alphabets of lowercase
         String a2=name1.replaceAll("[a-z]", "");
         System.out.println(a2);
         //replace all the alphabets of uppercase
         String a3=name1.replaceAll("[A-Z]", "");
         System.out.println(a3);
         
         //check string is empty
         boolean s1=name1.isEmpty();
         System.out.println(s1);
         String n1="";
         System.out.println(n1.isEmpty());
         //check strings are equal
         System.out.println(name.equals(name1));
         
	}
	

}
