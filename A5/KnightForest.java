import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class KnightForest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean quarter = true; // to play or not to play. That is the question.
		
		JFrame frame = new JFrame("JOptionPane showMessageDialog"); 
		while (quarter == true)
		{
		JOptionPane.showMessageDialog(frame,  //JOptionPane to show Knight1 info (Input created Class)
				"You have stumbled your way into JavaBean Forest!\n" +
				"A quest of peril and many monsters awaits you in your travels!");
		Knight knight = new Knight("Sir Jav-a-lot", 1337);
		String knn = JOptionPane.showInputDialog("What is the name of such a brave Knight?\n");
		knight.setName(knn);
		JOptionPane.showMessageDialog(frame,
			knight.toString());
		
		int nEm = 0; //value of enemies you wish to encounter
		
		nEm = Integer.parseInt(JOptionPane.showInputDialog(frame, "How many enemies does thou except "
				+ "to encounter on your ventures"));
		
		while (nEm > 0)
		{
			Enemy enemy = Enemy.getRandomEnemy();
			JOptionPane.showMessageDialog(frame, enemy.toString());
			
			int OptIn = 0;
			
			OptIn = JOptionPane.showConfirmDialog(null, 
		            "Do you wish to face this foe!?",
		            "Choose!",
		            JOptionPane.YES_NO_OPTION);
			
			if (OptIn == JOptionPane.YES_OPTION)
			{
				int round = 1;
				int edmg = 0;
				int kdmg = 0;
				int kHealth = knight.getHealth();
				int eHealth = enemy.getEHealth();
				
				while (kHealth > 0 && eHealth > 0)
				{
					if (round % 2 == 1) //round = knight
					{
						++round;
						kdmg = knight.fight();
						enemy.takeDamage(kdmg);
						eHealth = enemy.getEHealth();
						JOptionPane.showMessageDialog(frame,
								knight.getName() + 
								" unleashes an attack dealing "
								+ kdmg + " to " +
								enemy.getName()
								);
						JOptionPane.showMessageDialog(frame,
								knight.getName() + 
								" Health is " +
								knight.getHealth() +
								", " + enemy.getName() +
								" Health is " +
								enemy.getEHealth()
								);
					}
					else //round = enemy
					{
						++round;
						JOptionPane.showMessageDialog(frame,
								enemy.atkdesc()
									);
						edmg = enemy.fight();
						kHealth -= edmg;
						knight.setHealth(kHealth);
						kHealth = knight.getHealth();
						JOptionPane.showMessageDialog(frame,
								edmg + " damage to " +
								knight.getName() + "!"
								);
								
						JOptionPane.showMessageDialog(frame,
								knight.getName() + 
								" Health is " +
								knight.getHealth() +
								", " + enemy.getName() +
								" Health is " +
								enemy.getEHealth()
								);
					}
					if (kHealth <= 0)
					{
						JOptionPane.showMessageDialog(frame,
								knight.getName() +
								" has fallen in battle...");
					}
					if (eHealth <= 0)
					{
						JOptionPane.showMessageDialog(frame,
								"The " + enemy.getName() +
								" has been slain!");
					}
				} //
				--nEm;
			}
				
			if (OptIn == JOptionPane.NO_OPTION)
			{

				JOptionPane.showMessageDialog(frame,
						knight.getName() 
						+ " cowers and runs away!");

				--nEm;
			}
		}
		JOptionPane.showMessageDialog(frame,
				"You have made it through the perilous Javabean forest!");
		
		int Repeat = JOptionPane.showConfirmDialog(null, 
	            "Do you wish to play again?",
	            "Choose wisely.",
	            JOptionPane.YES_NO_OPTION);
		if (Repeat == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(frame,
					knight.getName() +
					", Thank you for playing!");
			quarter = false;
		}
		if (Repeat == JOptionPane.YES_OPTION)
		{
			quarter = true;
		}
		
		}	
	}

}
