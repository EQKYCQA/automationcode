package dClass;

public class d9SringClass
//How to handle string in java

{

	public static void main(String[] args) 
	{
		String Child1 = "Sri Nisha";
		//Store string in string variable
		boolean Elder = Child1.startsWith("Sri");
		//Starts with compare string starting with and return boolean
		System.out.println("Is my 1st child name starts with Sri: "+Elder);

		
		String Child2 = " Aadhiya Sri";
		boolean Younger = Child2.endsWith("Sri");
		System.out.println("Is my 2nd child name starts with Sri: "+Younger);
		
		
		String kids = Child1.concat(Child2);
		//Concatenate to text
		System.out.println("My kids name: "+kids);
		
		
		boolean kid1 = Child1.contains("Sri");
		System.out.println("My kid1 name contains Sri: "+kid1);
		
		
		int compare = Child2.trim().compareTo("Aadhiya Sri");
		//trim before and after space
		if (compare==0)
		{
			System.out.println("String Match");
		}
		else
		{
			System.out.println("String Not Match");
		}
		
		
		String []childNameArray = Child1.split(" ");
		//split string by specified splitter and store in array
		
		for(int i=0;i<=childNameArray.length;i++)
			//loop based on array length 
		{
			System.out.println("Arrary of i value is "+childNameArray[i]);
			//print string in array based on array index value
			break;
		}
		
		for(int j=0;j<=Child2.length();j++)
			//Iterate till the length of child 2
		{
			System.out.println(Child2.charAt(j));
			//print each char in child1
			break;
		}
		
	}

}
