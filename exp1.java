package sec3;

public class Triangle {
     private static double a,b,c;
     private static double findPerimeter()
     {
    	 return a+b+c;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		a=6;
		b=7;
		c=8;
		if(a+b>c)
		{
			System.out.println("perimeter="+findPerimeter());
		}
		else
			System.out.println("Invalid");
	}

}
