package gInheritance;

public class g5ChildClassScenario4ObjinChildwithPartentObjandChildRef extends g1ParentClass
{

	public static void main(String[] args) 
	{
		//g5ChildClassScenario4ObjinChildwithPartentObjandChildRef objg1ParentClass = new g1ParentClass();
		//Cannot store extended parent class in child class reference.
		
		System.out.println("I'm from class g5 but invalid");
	}
	
	public void childMethod()
	{
		System.out.println("Hey I'm child method");
	}

}
