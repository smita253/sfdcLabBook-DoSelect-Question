package javatest;




import java.text.SimpleDateFormat;
import java.util.*;

public class time {
	
	public static void main(String[] args) {	

//	Calendar c = Calendar.getInstance();
//	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//	String getCurrentTime = sdf.format(c.getTime());
	
	String currentTime="16:45";
	String runTime="15:45";
	
//	System.out.println(getCurrentTime);

	if (currentTime.compareTo(runTime) < 0)

	{
	   
		System.out.println("Return current less than runtime "); 
	}
	else
	{
		System.out.println("Return runtime older than currentTime "); 
	}
	}
}
