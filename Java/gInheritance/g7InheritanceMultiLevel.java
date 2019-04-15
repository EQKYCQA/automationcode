package gInheritance;

//MultiLevel Inheritance

class g7InheritanceMultiLevel 
{
	public void animal()
	{
		System.out.println("Animals eat. From base class");
	}

}

class cats extends g7InheritanceMultiLevel
{
	public void soundsMeom()
	{
		System.out.println("Sounds Meom. From child class");
	}
}

class dog extends cats
{
	public void soundsVow()
	{
		System.out.println("Sounds Vow. From Child of child class");
	}
	
public void main(String args[])
{
	dog d = new dog();
	d.animal();
	d.soundsMeom();
	d.soundsVow();

}
}