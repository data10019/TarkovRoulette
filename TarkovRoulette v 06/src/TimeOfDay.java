import java.util.Random;


//Class to get random time of day.
public class TimeOfDay 
{
	public static String getTime()
	{
		String[] time = {"AM", "PM"};
		int rand = new Random().nextInt(time.length);
		
		return time[rand];
	}
}
