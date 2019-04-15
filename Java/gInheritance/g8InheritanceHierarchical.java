package gInheritance;

//Hierarchical Inheritance

public class g8InheritanceHierarchical 
{
	public void animal()
	{
		System.out.println("Animals eat. From Base class");
	}
}

class cata extends  g8InheritanceHierarchical
{
	public void soundsMemo()
	{
		System.out.println("Cat sounds meom. From Child class");
	}
}

class doga extends  g8InheritanceHierarchical
{
	public void soundsVow()
	{
		System.out.println("Dog sounds vow. From Child class");
	}
	
	public void main(String args[])
	{
		doga dg = new doga();
		dg.animal();
		dg.soundsVow();
	}
			
}