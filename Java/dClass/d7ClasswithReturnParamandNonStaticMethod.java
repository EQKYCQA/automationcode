package dClass;

public class d7ClasswithReturnParamandNonStaticMethod 
{

	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public double div(double x, double y)
	{
		double z=x/y;
		return z;
	}
	
	public static String Name(String firstName, String lastName)
	{
		String fullName = firstName+" "+lastName;
		return fullName;
		
	}
}
