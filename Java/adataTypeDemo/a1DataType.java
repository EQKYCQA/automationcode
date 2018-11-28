package adataTypeDemo;

public class a1DataType
{

	public static void main(String[] args) 
	{
		// Primitive (boolean, char, byte, short, int, long, float & double and non primitive (string, array, class and interfaces) data type
		
		//Comment for declaration and initialization
		boolean newstaus = false;
		char x='a';
		//If number stored in char it will refer to ASCII table and get corresponding text.
		byte marks = 98;
		short total = 360;
		int empID = 99943;
		long mobile = 999409099;
		
		System.out.println("Boolean "+newstaus+", Char "+x+", byte "+marks+", total "+total+", int "+empID+", long "+mobile);
		
		float match = 100;
		
		double science = 82.34;
		
		float tamil=(float) 60.89;
		//Type casting: Converting one data type to another
		
		float english=72.50f;
		//recommends to store as one data type to other (double as float)
		
		//Down casting is converting higher data type to lower data type
		//Up casting is converting lower data type to hight data type
		
		System.out.println("Tamil: "+tamil+", English: "+english+", Match: "+match+", Science: "+science);
		
	}

}
