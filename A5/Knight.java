import java.util.Random;

public class Knight 
{
  Random random = new Random(); 
  public String name;
  protected int    health;
  
  public Knight(String name, int health)
  {
	  this.name = name; //
	  this.health = health; //
  }
  
  public void setName(String nm)
  {
	  this.name = nm;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getHealth()
  {
    return health;
  }
  
  public void setHealth(int health)
  {
    this.health = health;
  }
  
  public int fight()
  {
    int damage = 0;
    damage = 10 + random.nextInt(20);
    return damage;
  }
  
  @Override
  public String toString()
  {
    return "You are sir " + getName() + ", your health is " + getHealth() + ".";
  }
}