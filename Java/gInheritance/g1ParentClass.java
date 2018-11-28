package gInheritance;

public class g1ParentClass 
{
	String baseclass = "Hey, I'm a variable from base class";

	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Base class add method value is: "+c);
	}
	
	public void sub(int a, double b)
	{
		int c = (int) (a+b);
		
		System.out.println("Base class sub method value is :"+c);
		
	}
}