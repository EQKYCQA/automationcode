/*
In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.
*/
package iConstructor;

public class I3ParameterizedConstructorOverload 
{
	int id;
	String name;
	String childName;
	
	I3ParameterizedConstructorOverload(int rollNo, String employeeName)
	{
	id=rollNo;
	name=employeeName;
	}
	
	I3ParameterizedConstructorOverload(int rollNo, String employeeName, String child)
	{
	id=rollNo;
	name=employeeName;
	childName=child;
	}
	
	public void display()
	{
		System.out.println("Integer value of id: "+id+", String value of name: "+name+"String value of child: "+childName);
	}
	
	public static void main(String[] args) 
	{
		I3ParameterizedConstructorOverload i3 = new I3ParameterizedConstructorOverload(5, "Sam");
		I3ParameterizedConstructorOverload i3a = new I3ParameterizedConstructorOverload(5, "Sam","Sri");
		
		i3.display();
		i3a.display();
	}

}
