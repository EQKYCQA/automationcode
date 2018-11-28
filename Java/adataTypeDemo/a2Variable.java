package adataTypeDemo;

public class a2Variable
{
static int b;
//Global variable is a variable declared in method level which contains null value/default value 

	public static void main(String[] args) 
	{
		int a=10;
		//Local variable is a variable declared in method level which contains garbage values
		System.out.println(a+" "+b);
	}

}
