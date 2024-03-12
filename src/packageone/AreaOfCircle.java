package packageone;

public class AreaOfCircle 
{
 final static  double pi=3.14;

 static void circlearea()
 {
	 int r=14;
	 double area;
	 area=pi*r*r;
	 System.out.println("area of circle 1 is " +area);
 }
	public static void main(String[] args) 
	{
		
            int r1=7;
            double circleareas;
            circleareas= pi*r1*r1;
            System.out.println("area of circle 2 is " +circleareas);
            	circlearea();	
	}

}
