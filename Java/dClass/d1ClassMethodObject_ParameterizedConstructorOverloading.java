package dClass;

public class d1ClassMethodObject_ParameterizedConstructorOverloading 
{
int id;
String name;

public d1ClassMethodObject_ParameterizedConstructorOverloading(int i)
{
	id=i;
}

public d1ClassMethodObject_ParameterizedConstructorOverloading(int j, String employee)
{
	id=j;
	name=employee;
}

public void display()
{
	System.out.println("Employee id is:"+id+" and name is:"+name);
}
	public static void main(String[] args) 
	{
		d1ClassMethodObject_ParameterizedConstructorOverloading objD1 = new d1ClassMethodObject_ParameterizedConstructorOverloading(5);
		d1ClassMethodObject_ParameterizedConstructorOverloading objD2 = new d1ClassMethodObject_ParameterizedConstructorOverloading(5,"Sam");
		
		objD1.display();
		objD2.display();
				
	}

}
