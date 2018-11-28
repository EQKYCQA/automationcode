package fArray;

public class fArray 
//Array is a collection of similar data type
{

	public static void main(String[] args) 
	{
		fArray objfArray = new fArray();
		objfArray.oneDArray(2,"Sri Nisha","Aadhiya Sri");
		objfArray.twoDArray();
	}
	
	public void oneDArray(int noOfChild, String elderChild, String youngerChild)
	{
		String[] myArray = new String[noOfChild];
		//Create a one dimension array with size.
		
		myArray[0]=elderChild;
		myArray[1]=youngerChild;
		//Assign value to array
		
		System.out.println("No of child "+noOfChild);
		System.out.println("Elder "+elderChild);
		System.out.println("Younger "+youngerChild);
		
		for(int i=0; i<=noOfChild; i++)
		{
			System.out.println("Child Name: "+myArray[i]);
		}
	}
	
	public void twoDArray()
	{
		double[][] myArray = new double[2][3];
		//Create a two dimension array with size.
		
		myArray[0][0] = 1;
		//Assign value to array
		myArray[0][1] = 2;
		myArray[0][2] = 3;
		myArray[1][0] = 4;
		myArray[1][1] = 5;
		myArray[1][2] = 6;
		
		System.out.println("My 1st array value is "+myArray[1][2]);
	}

}
