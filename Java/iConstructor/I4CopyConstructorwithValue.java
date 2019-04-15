/*There is no copy constructor in java. However, we can copy the values from one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in java. They are:

By constructor
By assigning the values of one object into another
By clone() method of Object class
In this example, we are going to copy the values of one object into another using java constructor.
*/
package iConstructor;

public class I4CopyConstructorwithValue 
{
	int id;
	String name;
	
	//constructor to initialize integer and string 
	I4CopyConstructorwithValue(int rollNo, String employeeName)
	{
	id=rollNo;
	name=employeeName;
	}
	
	//constructor to initialize another object
	I4CopyConstructorwithValue(I4CopyConstructorwithValue s)
	{
		id=s.id;
		name=s.name;
	}
	
	public void display()
	{
		System.out.println("Integer value of id: "+id+", String value of name: "+name);
	}

	public static void main(String[] args) 
	{
		I4CopyConstructorwithValue i4 = new I4CopyConstructorwithValue(4,"Aadhi");
		I4CopyConstructorwithValue i4a = new I4CopyConstructorwithValue(i4);
		
		i4.display();
		i4a.display();
	}

}
