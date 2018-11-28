package gInheritance;

public class g2ChildClassScenario1ObjChildwithChildRefernce extends g1ParentClass
//Class name followed by Extends keyword and class name (class from which you wants to inherit and use it method. 
{

	public static void main(String[] args) 
	{
		
		g2ChildClassScenario1ObjChildwithChildRefernce objg2ChildClassScenario1ObjChildwithChildRefernce = new g2ChildClassScenario1ObjChildwithChildRefernce();
		//Creating object for child class with child class reference
		
		System.out.println(objg2ChildClassScenario1ObjChildwithChildRefernce.baseclass);
		//Using child class object, inheriting base class variable
		
		System.out.println(objg2ChildClassScenario1ObjChildwithChildRefernce.childclass);
		//Using child class object, calling child class variable
		
		objg2ChildClassScenario1ObjChildwithChildRefernce.add(10,20);
		//Using child class object, inheriting base class object
		
		objg2ChildClassScenario1ObjChildwithChildRefernce.sub(5, 10.256);
		//Using child class object, inheriting base class object
		
		objg2ChildClassScenario1ObjChildwithChildRefernce.mul(8, 3);
		//Using child class object, calling base class method
		
		objg2ChildClassScenario1ObjChildwithChildRefernce.div(25, 5);
		//Using child class object, inheriting base class method
	}

	String childclass = "Hey, I'm a variable from child class";
	
	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Child class multi method c value is: "+c);
	}
	
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println("Child class div method c value is: "+c);
	}
}
