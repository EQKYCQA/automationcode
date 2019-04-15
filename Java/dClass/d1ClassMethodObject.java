package dClass;

public class d1ClassMethodObject
//Class is a entity that bind data member (data type) & member method (User Function) into a single unit. Class is an example of encapsulation
{

	int x=90;
	int y=100;
	//data member or instance variable
	//stored in heap memory
	
	public static void main(String[] args) 
	{
		d1ClassMethodObject obj1 = new d1ClassMethodObject();
		//When object initialized memory allocated for data member and method. Object required for calling non static method.
		//obj1 stored in stack
		
		System.out.println("X value: "+obj1.x);
		System.out.println("Y value: "+obj1.y);
		obj1.sum();
		
		d1ClassMethodObject obj2 = new d1ClassMethodObject();
		//When this object initialized separate memory allocated for data member and method. One class can have multiple objects.
		
		System.out.println("X value: "+obj2.x);
		System.out.println("Y value: "+obj2.y);
		obj2.sum();
	}
	
	public void sum()
	//Non static method
	{
		int a=90;
		int b=100;
		int c=a+b;
		System.out.println("Sum of two number is: "+c);
	}

}
