package bLoops;

import java.util.ArrayList;
import java.util.List;

public class b1loops 
{
	public static void main(String[] args) 
	{
		forloop();
		whileloop();
		dowhileloop();	
		forEachLoop();
	}
	
	public static void forloop()
	{
		int i; 
		for(i=1;i<=5;i++)
			//Run until condition met
			//for(Initialization;condition;increment/decrement)
			//for(i=1;i<5;i+2) to increment by 2
			//for(i=1;i<5;i--) to decrement
		{
			System.out.println("For loop value of i is :"+i);
		}
	}
	
	public static void whileloop()
	{
		int j=1;
		while(j<=3)
			//Run only when condition met
			//while(condition)
		{
			System.out.println("While loop value of j when j<=3 is:"+j);
			j++;
		}
	}

	public static void dowhileloop()
	{
		int k=1;
		do
			//Run once and continue when condition met
		{
			System.out.println("Do while loop value of k:"+k);
			k++;
		}
		while(k<=4);
	}
	
	public static void forEachLoop()
	{
		int[] marks = { 125, 132, 95, 116, 110 }; 
		for(int i:marks)
		{
			System.out.println("mark is "+i);
		}
			
	}
}
