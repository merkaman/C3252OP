/*
 * Dominique Smith
 * 2/14/16
 * This is the main function for the Knight building program
 * It does all the output input work
 */
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class KnightDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("JOptionPane showMessageDialog"); 
		Stars Star1 = new Stars(0, 0);
		Knight Knight1 = new Knight("Knight", 100, 0, 1, 0); //Changed knight class
		Knight Knight2 = new Knight("Sir Jav-a-lot", 12, 6, 25, 100); //Premade knight 1
		Knight Knight3 = new Knight("Sir Foobar", 42, 31, 13, 320); //Premade knight 2
		Knight Knight4 = new Knight("Sir Kludge", 2, 0, 87, 1); //Premade knight 3
		int selectedOption = JOptionPane.showConfirmDialog(null, 
                "Do you wish to create a new Knight?",  //JOption Y/N for new knight or not
                "Choose", 
                JOptionPane.YES_NO_OPTION); 
if (selectedOption == JOptionPane.YES_OPTION) {
		
		String name = JOptionPane.showInputDialog("Please input your name.\n");
		Knight1.setName(name); //Name retrieval
		int health = Integer.parseInt(JOptionPane.showInputDialog("Please input your health.\n"));
		Knight1.setHealth(health); //Health retrieval
		int battles = Integer.parseInt(JOptionPane.showInputDialog("Please input your battles.\n"));
		Knight1.setBattles(battles); //Battles retrieval
		int age = Integer.parseInt(JOptionPane.showInputDialog("Please input your age.\n"));
		Knight1.setAge(age); //Age retrieval
		int gold = Integer.parseInt(JOptionPane.showInputDialog("Please input your gold.\n"));
		Knight1.setGold(gold); //Gold retrieval
		int nCol = Integer.parseInt(JOptionPane.showInputDialog("Please input your Column of Stars.\n"));
		Star1.setColumn(nCol); //Column retrieval
		int nRow = Integer.parseInt(JOptionPane.showInputDialog("Please input your Column of Stars.\n"));
		Star1.setRow(nRow); //Row retrieval
		JOptionPane.showMessageDialog(frame,  //JOptionPane to show Knight1 info (Input created Class)
				"Knight Name: " + Knight1.getName() +
				"\nKnight Health: " + Knight1.getHealth() +
				"\nKnight Battles: " + Knight1.getBattles() +
				"\nKnight Age: " + Knight1.getAge() +
				"\nKnight Gold: " + Knight1.getGold() +
				"");
		Star1.StarProcedure(nRow, nCol);
			
		
		System.exit(0); //Exit
}
else; 
	int nCol = Integer.parseInt(JOptionPane.showInputDialog("Please input your Column of Stars.\n"));
	Star1.setColumn(nCol); //Column retrieval
	int nRow = Integer.parseInt(JOptionPane.showInputDialog("Please input your Column of Stars.\n"));
	Star1.setRow(nRow); //Row retrieval
	int select = Integer.parseInt(JOptionPane.showInputDialog("Choose your knight 1-3")); //Switch Case for 3 different knights

	switch(select)
	{
	
	case 1:
	{
		JOptionPane.showMessageDialog(frame,  //Premade Knight 1 and so on
				"Knight Name: " + Knight2.getName() +
				"\nKnight Health: " + Knight2.getHealth() +
				"\nKnight Battles: " + Knight2.getBattles() +
				"\nKnight Age: " + Knight2.getAge() +
				"\nKnight Gold: " + Knight2.getGold() +
				"\n" );
		Star1.StarProcedure(nRow, nCol);
		break;
	}
	
	case 2:
	{
		JOptionPane.showMessageDialog(frame, 
				"Knight Name: " + Knight3.getName() +
				"\nKnight Health: " + Knight3.getHealth() +
				"\nKnight Battles: " + Knight3.getBattles() +
				"\nKnight Age: " + Knight3.getAge() +
				"\nKnight Gold: " + Knight3.getGold() +
				"\n" );
		Star1.StarProcedure(nRow, nCol);
		break;
	}
	
	case 3:
	{
		JOptionPane.showMessageDialog(frame, 
				"Knight Name: " + Knight4.getName() +
				"\nKnight Health: " + Knight4.getHealth() +
				"\nKnight Battles: " + Knight4.getBattles() +
				"\nKnight Age: " + Knight4.getAge() +
				"\nKnight Gold: " + Knight4.getGold() +
				"\n" );
		Star1.StarProcedure(nRow, nCol);
		break;
	}
	
	default:
	{
		JOptionPane.showMessageDialog(null, "Sorry, that Knight is currently unavaiable.");  //Default incase non 1-3 input
		break;
	}
	}
	}
	}


