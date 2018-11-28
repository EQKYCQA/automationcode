package dClass;
public class d3CalClasswithStaticandNonStaticMethod
{

	public static void main(String[] args) 
	{
		d2ClasswithDataandNonStaticMethod objClassInvoking = new d2ClasswithDataandNonStaticMethod();
		//Create object of another class and access their data member and data method.
		
		objClassInvoking.sub();
		objClassInvoking.multiply();
		System.out.println(objClassInvoking.Substraction);
		System.out.println(objClassInvoking.multiplication);
		
		d4ClasswithDataandStaticMethod.div();
		//Static method from a class can be directly invoked without using object.
	}

}
