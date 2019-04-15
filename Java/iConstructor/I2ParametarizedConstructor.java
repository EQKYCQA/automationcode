/*
A constructor which has a specific number of parameters is called a parameterized constructor.

Why use the parameterized constructor?
The parameterized constructor is used to provide different values to the distinct objects. However, you can provide the same values also.

Example of parameterized constructor
In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.
 */
package iConstructor;

public class I2ParametarizedConstructor 
{

	int a;
	String name;
	
	//creating a parameterized constructor
	//Constructor should not have return type
	I2ParametarizedConstructor(int i, String employee)
	{
		a=i;
		name=employee;
	}
	
	public void display()
	{
		System.out.println("Integer value:"+a+", String value:"+name);
	}
	
	
	public static void main(String[] args) 
	{
		//creating objects and passing values
		I2ParametarizedConstructor I2 = new I2ParametarizedConstructor(5,"Sam");
		
		//calling method to display the values of object
		I2.display();
	}

}
