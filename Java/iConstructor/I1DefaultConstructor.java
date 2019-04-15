package iConstructor;

public class I1DefaultConstructor 
{

	int a;
	String name;
	
	public void display()
	{
		System.out.println("Integer default value:"+a+", String default value:"+name);
	}
	public static void main(String[] args) 
	{
		I1DefaultConstructor i1 = new I1DefaultConstructor();
		
		//Display value in variable a and name. By default while calling assign default value 0 to integer and null to string.  
		i1.display();
	}

}
