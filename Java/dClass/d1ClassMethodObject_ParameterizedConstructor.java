package dClass;

public class d1ClassMethodObject_ParameterizedConstructor 
{
int id;

public d1ClassMethodObject_ParameterizedConstructor(int i)
//Constructor don't have return type and name should be same as class
{
	id=i;
	//Can access global variable inside constructor without obj
}

public static void main(String args[])
{
	d1ClassMethodObject_ParameterizedConstructor objD1 = new d1ClassMethodObject_ParameterizedConstructor(5);
	
	System.out.println(objD1.id);
	
}

}
