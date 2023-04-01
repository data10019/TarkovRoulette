import java.util.Random;

//Class to get random weapon type.
public class WeaponType
{
	public static String getWeapon()
	{
		String[] weapon = {"Assault Rifle", "Assault Carbine", "LMG", "SMG", "Shotgun", "DMR", "Sniper Rifle", "Grenade Launcher", "Pistol"};
		int rand = new Random().nextInt(weapon.length);
		return weapon[rand];
		
	}
}
