package hInterface;

public class H2ClasswithChildClassObjandRefer implements H1InterfaceParent
//Inherit interface using implements keyword

{
	public static void main(String[] args) 
	{
		H2ClasswithChildClassObjandRefer objH2ClasswithChildClassObjandRefer = new H2ClasswithChildClassObjandRefer();
		//Creating object and reference for interface inherited child class

		int y = 20;
		
		objH2ClasswithChildClassObjandRefer.add(5, 10);
		//Using abstract method from interface
		
		objH2ClasswithChildClassObjandRefer.sub(20, x);
		//Using variable and abstract method from interface
		
		objH2ClasswithChildClassObjandRefer.multi(x, y);
		//Using variable and method from child class
	}

	@Override
	public void add(int a, int b) 
	{
	int c = a+b;
	System.out.println("My sum value is: "+c);
		
	}

	@Override
	public void sub(int a, int b) 
	{
		int c = a-b;
		System.out.println("My sub value is: "+c);
			
	}

	public void multi(int a, int b) 
	{
		int c = a*b;
		System.out.println("My multi value is: "+c);
			
	}
}