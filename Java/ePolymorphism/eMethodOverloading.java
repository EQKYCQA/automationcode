package ePolymorphism;

public class eMethodOverloading
//Same method name will be overloaded with different number, type and order results unique function. Where only called method will be initialized in compile time based on argument is method overloading or early binding  
{

	public static void main(String[] args) 
	{
	
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum of int a and b is "+c);
	}
	
	public void add(int a, int b, int d)
	//Same method name overloaded with different no of argument/signature
	{
		int c=a+b+d;
		System.out.println("Overloaded with different no of argument/signature. Sum of int a, b and d is "+c);
	}
	
	public void add(double a, double b)
	//Same method name overloaded with different type of argument/signature
	{
		double c=a+b;
		System.out.println("overloaded with different type of argument/signature. Sum of double a and b is "+c);
	}
	
	public void add(double a, int b)
	//Same method name overloaded with different order of argument/signature
	{
		double c=a+b;
		System.out.println("overloaded with different order of argument/signature. Sum of double a and b is "+c);
	}
	
	public void add(int a, double b)
	//Same method name overloaded with different type of argument/signature
	{
		double c=a+b;
		//Integer summed with double and stored in double is up casting.
		System.out.println("overloaded with different type of argument/signature. Sum of double a and b is "+c);
	}

}
