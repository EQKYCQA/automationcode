package oOther;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class O1Timeline 
{

	public static void main(String[] args) throws ParseException
	{
		O1Timeline O1timeline = new O1Timeline();

		O1timeline.addMonth(2);
	}
	
	public String addMonth(int month) throws ParseException
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, month); // to get previous year add -1
		SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");
		String date = format.format(cal.getTime());
		System.out.println(date);
		
		return date;
	}
}
