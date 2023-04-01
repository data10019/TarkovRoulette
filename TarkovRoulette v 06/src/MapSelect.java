import java.util.Random;

//Class to get random map.
public class MapSelect 
{
	public static String getMap()
	{
		String[] map = {"Factory", "Shoreline", "Reserve", "Customs", "Woods", "Labs", "Interchange"};
		int rand = new Random().nextInt(map.length);
		return map[rand];
	}
}
