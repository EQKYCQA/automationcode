package iConstructor;

public class I5CopyValueWithoutConstructor 
{
	int id;
	String name;
	
	I5CopyValueWithoutConstructor(int rollNo, String employeeName)
	{
	id=rollNo;
	name=employeeName;
	}
	
	I5CopyValueWithoutConstructor()
	{
		
	}

	public void display()
	{
		System.out.println("Integer value of id: "+id+", String value of name: "+name);
	}
	
	public static void main(String[] args) 
	{
		I5CopyValueWithoutConstructor i5 = new I5CopyValueWithoutConstructor(5, "Mohan");
		I5CopyValueWithoutConstructor i5a = new I5CopyValueWithoutConstructor();
		
		//We can copy the values of one object into another by assigning the objects values to another object. In this case, there is no need to create the constructor.
		i5a.id=i5.id;
		i5a.name=i5.name;
		
		i5.display();
		i5a.display();
	}
}