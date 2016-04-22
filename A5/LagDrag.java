
public class LagDrag extends Enemy {

	public LagDrag(String name, int ehealth) {
		super(name, ehealth);
		setDescription("A sluggish dragon. Its speed is reduced by it's large stature! (or perhaps its terrible connection.)");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int fight()
	{
		int dmg = 0;
		dmg = m* (10 + random.nextInt(15) + a);
		return dmg;
	}
	

	@Override
	public String atkdesc()
	{
		int n;
		n = 1 + random.nextInt(5);
		
		switch(n)
		{
		case 1:
			m = 0;
			a = 10;
		return "The Laggon Dragon can't move!";
		case 2:
			m = 0;
			a = 10;
		return "The Laggon Dragon swings... 10 seconds too late!";
		case 3:
			m = 0;
			a = 10;
		return "The Laggon Dragon is getting DDoS'd.";
		case 4:
			m = 2;
			a = 50;
		return "The Laggon Dragon's cast a ping buff! It gets an attack in, finally!";
		default:
			m = 0;
			a = 10;
		return "The Laggon Dragon let's out a firey sigh!";
		}
	}
	
	@Override
	public String toString()
	{
	return "\nThe enemy is " + getName() + ", " + getDescription() + "\nIts health is: " + getEHealth();
	}

}
