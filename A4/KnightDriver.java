import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class KnightDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JOptionPane showMessageDialog"); 
		int RepeatOption = 0;
		
		while (RepeatOption == JOptionPane.YES_OPTION){ //Repeat Program 
			Knight Knight1 = new Knight("Knight", 100, 0, 0, "Naked", "Fist"); //User Knight
			Knight Knight2 = new Knight("Knightokun", 100, 0, 0, "Naked", "Fist"); //Enemy Knight
		Random hp = new Random();
			Knight1.setHealth(hp.nextInt(201)); //set User health rand
			Knight2.setHealth(hp.nextInt(201)); //set Enemy health rand
		JOptionPane.showMessageDialog(frame,  //JOptionPane to show Knight1 info (Input created Class)
				"Welcome to Knight Fight!");
		String name = JOptionPane.showInputDialog("Please input your name.\n");
		Knight1.setName(name); //Name retrieval
		int select = Integer.parseInt(JOptionPane.showInputDialog(frame,"Choose your weapon!" + //weapon choice User
				"\n1) Long Sword" +
				"\n2) Magic Staff" +
				"\n3) Spear" +
				"\n4) Warhammer"));
		if (select > 4)
		{
		 select = 0;	
		}
		switch(select)
		{
		case 1:
			Knight1.setDefense(3);
			Knight1.setDamage(2);
			Knight1.setWeapon("Long Sword");
			Knight1.setArmor("Leather");
			break;
		case 2:
			Knight1.setDefense(1);
			Knight1.setDamage(4);
			Knight1.setWeapon("Magic Staff");
			Knight1.setArmor("Cloth");
			break;
		case 3:
			Knight1.setDefense(4);
			Knight1.setDamage(1);
			Knight1.setWeapon("Spear");
			Knight1.setArmor("Chainmail");
			break;
		case 4:
			Knight1.setDefense(2);
			Knight1.setDamage(3);
			Knight1.setWeapon("Warhammer");
			Knight1.setArmor("Barbaric");
			break;
		default:
			break;
		}
		int selectedOption = JOptionPane.showConfirmDialog(null, 
                "Would you like to create your enemy knight?",  //JOption Y/N for new knight or not
                "Choose", 
                JOptionPane.YES_NO_OPTION); 
if (selectedOption == JOptionPane.YES_OPTION) {	
	String name2 = JOptionPane.showInputDialog("Please input your enemie's name.\n");
	Knight2.setName(name2); //Name retrieval
	int select1 = Integer.parseInt(JOptionPane.showInputDialog(frame,"Choose your enemies weapon!" + //weapon choice enemy
			"\n1) Long Sword" +
			"\n2) Magic Staff" +
			"\n3) Spear" +
			"\n4) Warhammer"));
	if (select1 > 4)
	{
	 select1 = 0;	
	}
	switch(select1)
	{
	case 1:
		Knight2.setDefense(3);
		Knight2.setDamage(2);
		Knight2.setWeapon("Long Sword");
		Knight2.setArmor("Leather");
		break;
	case 2:
		Knight2.setDefense(1);
		Knight2.setDamage(4);
		Knight2.setWeapon("Magic Staff");
		Knight2.setArmor("Cloth");
		break;
	case 3:
		Knight2.setDefense(4);
		Knight2.setDamage(1);
		Knight2.setWeapon("Spear");
		Knight2.setArmor("Chainmail");
		break;
	case 4:
		Knight2.setDefense(2);
		Knight2.setDamage(3);
		Knight2.setWeapon("Warhammer");
		Knight2.setArmor("Barbaric");
		break;
	default:
		break;
	}
}
	else
	{
		 Random randsel = new Random(); //Random for if User does not wish to make a knight
		switch(randsel.nextInt(5))
		{
		case 1:
			Knight2.setDefense(3);
			Knight2.setDamage(2);
			Knight2.setWeapon("Long Sword");
			Knight2.setArmor("Leather");
			break;
		case 2:
			Knight2.setDefense(1);
			Knight2.setDamage(4);
			Knight2.setWeapon("Magic Staff");
			Knight2.setArmor("Cloth");
			break;
		case 3:
			Knight2.setDefense(4);
			Knight2.setDamage(1);
			Knight2.setWeapon("Spear");
			Knight2.setArmor("Chainmail");
			break;
		case 4:
			Knight2.setDefense(2);
			Knight2.setDamage(3);
			Knight2.setWeapon("Warhammer");
			Knight2.setArmor("Barbaric");
			break;
		default:
			break;
	}
	}
		JOptionPane.showMessageDialog(frame,  //JOptionPane to show Knight1 info (Input created Class)
				Knight1.toString());
		
		JOptionPane.showMessageDialog(frame,
				Knight2.toString());
		int m = 0; //Multiplier value for Knight1 armor vs weapon
		int n = 0; //Multiplier value for Knight 2 armor vs weapon
		if(Knight1.damage > Knight2.defense)
		{
			m = 2;
		}
		else
		{
			m = 1;
		}
		if(Knight2.damage > Knight1.defense)
		{
			n = 2;
		}
		else
		{
			n = 1;
		}
		while (Knight1.health > 0 && Knight2.health > 0)
		{
		Random turn = new Random();
		if(turn.nextInt(2) == 0)
		{
			int atk = Knight1.fight() * m;
			JOptionPane.showMessageDialog(frame,
					"Knight " + Knight1.getName() + " attacks for " + atk + "!"); //Attacks
			Knight2.setHealth(Knight2.getHealth() - atk);
		}
		else
		{
			int atk = Knight2.fight() * n;
			JOptionPane.showMessageDialog(frame,
					"Knight " + Knight2.getName() + " attacks for " + atk + "!");
			Knight1.setHealth(Knight1.getHealth() - atk);
		}
		}
		if (Knight1.health <= 0)
		{
			JOptionPane.showMessageDialog(frame,
					"Knight " + Knight1.getName() + " has fallen in battle!");
			JOptionPane.showMessageDialog(frame,
					"Knight " + Knight2.getName() + " is our victor!");
			RepeatOption = JOptionPane.showConfirmDialog(null, 
		            "Would you like to fight again?",  //JOption Y/N for repeat program or exit
		            "Choose!", 
		            JOptionPane.YES_NO_OPTION); 
			if (RepeatOption == JOptionPane.NO_OPTION)
			{
			System.exit(0);
			}
		}
		else
		if (Knight2.health <= 0)
		{
			JOptionPane.showMessageDialog(frame,
					"Knight " + Knight2.getName() + " has fallen in battle!");
			JOptionPane.showMessageDialog(frame,
					"Knight " + Knight1.getName() + " is our victor!");
			RepeatOption = JOptionPane.showConfirmDialog(null, 
		            "Would you like to fight again?",  //JOption Y/N for repeat program or exit
		            "Choose!", 
		            JOptionPane.YES_NO_OPTION); 
			if (RepeatOption == JOptionPane.NO_OPTION)
			{
			System.exit(0);
			}
		}
		}
	}
}
		
	



