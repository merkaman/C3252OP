
public class AngryPie extends Enemy {

	public AngryPie(String name, int ehealth) {
		super(name, ehealth);
		setDescription("an out of season, irate, Minced Meat Pie. Ingredients: Unknown");
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String atkdesc()
	{
		int n;
		n = 1 + random.nextInt(3);
		
		switch(n)
		{
		case 1:
			m = 1;
			a = 10;
		return "The Minced Meat Pie discharges mystery meat in your direction!";
		case 2:
			m = 1;
			a = 5;
		return "The Minced Meat Pie lets off an unknown repugnant odor!";
		default:
			m = 1;
			a = 600;
		return "The Minced Meat Pie explodes! Gross, and Lethal!";
		}
	}
	
	@Override
	public int fight()
	{
		int dmg = 0;
		dmg = m * (4 + random.nextInt(20) + a);
		return dmg;
	}
	
	@Override
	public String toString()
	{
	return "\nThe enemy is " + getName() + ", " + getDescription() + "." + "\nIts health is: " + getEHealth();
	}

}
