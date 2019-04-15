package gInheritance;

public class g6InheritanceSingleInheritance 
{
	public void animal()
	{
		System.out.println("Animals eat. From Base class");
	}

}

class cat extends g6InheritanceSingleInheritance
{
	public void soundsMeom()
	{
		System.out.println("Sounds Meom. From child class");
	}
	
	public void main(String args[])
	{
		cat c = new cat();
		c.animal();
		c.soundsMeom();
				
	}
}