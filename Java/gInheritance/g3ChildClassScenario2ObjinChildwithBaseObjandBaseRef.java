package gInheritance;

public class g3ChildClassScenario2ObjinChildwithBaseObjandBaseRef extends g1ParentClass 
{

	public static void main(String[] args) 
	{
		g1ParentClass objg1BaseClass = new g1ParentClass();
		//Creating object for base class with base class reference. Which means we can use only base class variable and method
		
		System.out.println(objg1BaseClass.baseclass);
		
		objg1BaseClass.add(5, 50);

		//System.out.println(objg1BaseClass.childclass);
		
		//objg1BaseClass.mul(5, 50);

	}

	int a;
	
	public void method()
	{
		System.out.println("Child method");
	}
}
