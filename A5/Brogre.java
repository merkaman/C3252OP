
public class Brogre extends Enemy {
	
	public Brogre(String name, int ehealth) {
		super(name, ehealth);
		setDescription("A cool, trendy, ogre. No time to party though, for he is your foe, bro!");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int fight()
	{
		int dmg = 0;
		dmg = m *(10 + random.nextInt(15) + a);
		return dmg;
	}
	

	@Override
	public String atkdesc()
	{
		int n;
		n = 1 + random.nextInt(4);
		
		switch(n)
		{
		case 1:
			m = 3;
			a = 2;
		return "The Brogre styles all over you.";
		case 2:
			m = 2;
			a = 0;
		return "The Brogre insults your swagger!";
		case 3:
			m = 2;
			a = 10;
		return "The Brogre bashes it's brew on your skull!";
		default:
			m = 4;
			a = 5;
		return "The Brogre rallies the brogods to empower its strike!";
		}
	}
	
	@Override
	public String toString()
	{
	return "\nThe enemy is " + getName() + ", " + getDescription() + "\nIts health is: " + getEHealth();
	}

}
