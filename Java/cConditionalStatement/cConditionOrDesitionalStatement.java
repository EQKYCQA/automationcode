package cConditionalStatement;

public class cConditionOrDesitionalStatement 
{

	public static void main(String[] args) 
	{
		//ifCondition();
		//ifelseCondition();
		//nestedif();
		swtich();

	}
	
	public static void ifCondition()
	{
		int i=0;
		System.out.println("Initial i value is "+i);
		for(i=1;i<=6;i++)
		{
		if(i==3)
			//perform the below action only when condition match
			{
			System.out.println("If condition satisfied as i=3 and i value is "+i);
			}
		if(i==4)
			//perform the below action only when condition match
			{
			System.out.println("If condition satisfied as i=4 and i value is "+i);
			}
		}
		System.out.println("Final i value is "+i);
	}
	
	public static void ifelseCondition()
	{
		int j=0;
		System.out.println("Initial j value is "+j);
		while(j<=6)
		{
		if(j==2)
			//perform the below action only when condition match
			{
			System.out.println("If condition satisfied as j=3 and j value is "+j);
			}
		else
			//perform the below action only when condition match
			{
			System.out.println("Else j value is "+j);
			}
		j++;
		}
		System.out.println("Final j value is "+j);
	}
	
	public static void nestedif()
	{
		int k=0;
		System.out.println("Initial k value is "+k);
		while(k<=6)
		{
		if(k==2)
			//perform the below action only when condition match
			{
			System.out.println("If condition satisfied as k=2 and k value is "+k);
			}
		else if(k==3)
			//perform the below action only when condition match
			{
			System.out.println("Elseif k=3 value is "+k);
			}
		else
			{
			System.out.println("Else k value is "+k);
			}
		k++;
		}
		System.out.println("Final k value is "+k);
	}
	
	public static void swtich()
	{
		int l=1;
		
			switch(l)
			{
			case 1:
			System.out.println("Rating Good: "+l);
			break;
		
			case 2:
			System.out.println("Rating average: "+l);
			break;
			
			default:
			System.out.println("Default: "+l);
			}
	}
}
