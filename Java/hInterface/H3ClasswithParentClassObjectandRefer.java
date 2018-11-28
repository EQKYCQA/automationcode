package hInterface;

public class H3ClasswithParentClassObjectandRefer implements H1InterfaceParent 
{

	public static void main(String[] args) 
	{
	
		//H1InterfaceParent objH1InterfaceParent = new H1InterfaceParent();
		//This is not possible as we cannot inherit interface object using interface reference
		
		//H3ClasswithParentClassObjectandRefer obj1H1InterfaceParent = new H1InterfaceParent();
		//This is not possible as we cannot inherit interface object using class reference
		
		H1InterfaceParent obj1H3ClasswithParentClassObjectandRefer = new H3ClasswithParentClassObjectandRefer();
		//We can inherit class using interface reference, by which we can access interface items alone
		
		obj1H3ClasswithParentClassObjectandRefer.add(5, 9);

		//obj1H3ClasswithParentClassObjectandRefer.multi(5,5);
	}

	@Override
	public void add(int a, int b) 
	{
	int c = a+b;
	System.out.println("My sum value is: "+c);
		
	}

	@Override
	public void sub(int a, int b) 
	{
		int c = a-b;
		System.out.println("My sub value is: "+c);
			
	}

	public void multi(int a, int b) 
	{
		int c = a*b;
		System.out.println("My multi value is: "+c);
			
	}

}
