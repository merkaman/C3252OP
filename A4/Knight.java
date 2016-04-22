import java.util.Random;

public class Knight {

	private String name;
	public int health;
	public int defense;
	public int damage;
	public String armor;
	public String weapon;
	
	public Knight(String name, int health, int defense, int damage, String armor, String weapon) //constructor
	{
		this.name = name; //
		this.health = health; //
		this.defense = defense; //
		this.damage = damage; //
		this.armor = armor; //
		this.weapon = weapon;
	}
	public void setWeapon(String weapon)
	{
		this.weapon = weapon;
	}
	
	public String getWeapon()
	{
		return weapon;
	}
	public void setArmor(String armor)
	{
		this.armor = armor;
	}
	
	public String getArmor()
	{
		return armor;
	}
	public void setDefense(int defense)
	{
		this.defense = defense;
	}
	
	public int getDefense()
	{
		return defense;
	}
	
	public void setDamage(int damage)
	{
		this.damage = damage;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;	
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}

	public int getHealth()
	{
		return health;	
	}
	
	public String toString()
	{
		return "We have Knight " + this.name + 
				" wielding a " + this.weapon + 
				" wearing some " + this.armor + " armor."
				+ "\nhealth: " + this.health ;
	}
	
	public int fight()
	{
	Random dmg = new Random();
	int r = this.damage;
	int dmgi = 0;
	switch(r)
	{
	case 1:
		dmgi = dmg.nextInt(11);
		break;
	case 2:
		dmgi = dmg.nextInt(21);
		break;
	case 3:
		dmgi = dmg.nextInt(31);
		break;
	case 4:
		dmgi = dmg.nextInt(41);
		break;
	default:
		dmgi = dmg.nextInt(4);
		break;
	}
	return dmgi;
	
	}
	}

