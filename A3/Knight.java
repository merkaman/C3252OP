
public class Knight {

private String name;
public int health;
public int battles;
public int age;
public int gold;

public Knight(String name, int health, int battles, int age, int gold) //constructor
{
	this.name = name;
	this.health = health;
	this.battles = battles;
	this.age = age;
	this.gold = gold;
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

public void setBattles(int battles)
{
	this.battles = battles;
}

public int getBattles()
{
	return battles;
}

public void setAge(int age)
{
	this.age = age;
}

public int getAge()
{
	return age;
}

public void setGold(int gold)
{
	this.gold = gold;
}

public int getGold()
{
	return gold;
}
}

