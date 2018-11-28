package dClass;

public class d8CalClasswithReturnParamandNonStaticMethod 
{

	public static void main(String[] args)
	{
	
		d7ClasswithReturnParamandNonStaticMethod objd7ClasswithReturnParamandNonStaticMethod = new d7ClasswithReturnParamandNonStaticMethod();
		
		int add = objd7ClasswithReturnParamandNonStaticMethod.sum(10, 20);
		//While calling a method with return type, needs to receive with same return type variable.
		
		System.out.println("Addition value of a & b is: "+add);
		
		double divident = objd7ClasswithReturnParamandNonStaticMethod.div(39, 17.25);
		//While calling a method with return type, needs to receive with same return type variable.
		
		System.out.println("Division of x by y is: "+divident);
		
		String MyName = d7ClasswithReturnParamandNonStaticMethod.Name("Sri Nisha", "Priya Sampath kumar");
		//While calling a static method with return type, needs to receive with same return type variable.
		
		System.out.println("My fullname is: "+MyName);
	}

}
