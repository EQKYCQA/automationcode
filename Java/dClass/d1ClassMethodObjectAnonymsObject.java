package dClass;

public class d1ClassMethodObjectAnonymsObject 
{

	public void fact(int n)
	{
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("I value:"+i+" and fact value:"+fact);
		}
		System.out.println("Factorial value:"+fact);
		
	}
	public static void main(String[] args) 
	{	
	//Creating multiple object for a class
		
	new d1ClassMethodObjectAnonymsObject().fact(5);
	//calling a method through anonymous object, a non reusable object. 
	
	d1ClassMethodObjectAnonymsObject objd1 = new d1ClassMethodObjectAnonymsObject();
	//Calling a method through reference object.
	
	objd1.fact(10);
	}

}
