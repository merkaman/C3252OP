import java.util.Random;

public abstract class Enemy {

	static Random random = new Random();
	protected String name;
	protected int ehealth;
	protected String Description;
	protected int a = 0;
	protected int m = 1;
	
	public Enemy(String name, int ehealth)
	{
		this.name = name;
		this.ehealth = ehealth;
	}
	
	public abstract int fight();
	
	public String getName()
	{
		return name;
	}
	
	public int getEHealth()
	{
		return ehealth;
		
	}
	
	public void setEHealth(int health)
	{
		if (health < 0.0)
			throw new IllegalArgumentException("Health must not be below 0!");
		ehealth = health;
	}
	
	public void takeDamage(int damage)
	{
		int health = getEHealth();
		
		if (damage <0.0)
			throw new InvalidDmgException("Damage cannot be below 0!");
		health -= damage;
		if (health <0)
		{
			health = 0;
		}
		setEHealth(health);
	}
	
	public class InvalidDmgException extends RuntimeException
	{
		
		/**
		 * 
		 */
		//default ID
		private static final long serialVersionUID = 1L; 

		public InvalidDmgException(String message)
		{
			super(message);
		}
	}
	
	@Override
	public String toString()
	{
		return "\nThe enemy is " + getName() + "," + getDescription() + "." + "\nIt's health is: " + getEHealth();	
	}
	
	public String getDescription()
	{
		return Description;
	}
	
	public void setDescription(String Desc)
	{
	Description = Desc;
	}
	
	public static Enemy getRandomEnemy()
	{
		int n;
		n = 1 + random.nextInt(4);
		
		switch(n)
		{
		case 1:
		return new AngryPie("EVIL Minced Meat Pie", 32);
		case 2:
		return new Gawkatrice("Gawkatrice", 77);
		case 3:
		return new Brogre("Brogre", 120);
		default:
		return new LagDrag("Laggon Dragon", 230);
		}
	}

	public abstract String atkdesc();
	
}
