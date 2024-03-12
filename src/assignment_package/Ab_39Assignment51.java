//check if the given string contains space

package assignment_package;

public class Ab_39Assignment51 
{

	public static void main(String[] args) 
	{
		String name="dhruv pravin";
		char n1[]=name.toCharArray();
       for(int i=0;i<=name.length()-1;i++)
       {
    	   boolean answer=Character.isSpaceChar(n1[i]);
     // System.out.println(answer);
      if (answer==true)
      {
		System.out.println("At index "+ i + " Given String contains space.");
	}
      
       }
		
		}

}
