import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.sampled.AudioInputStream;*/
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComponent;

/*
 * Dominique Smith Tic Tac Toe Program
 * Finished on 3/4/2016
 * Plays Tic Tac Toe with win and loss states
 */

public class TicTacToe extends JFrame implements ActionListener {
	//variables
	public int burd[][] = new int [3][3];
	public int Playerwho = 0;
	JPanel centerPanel = new JPanel(new GridLayout(3,3));
	JPanel s=new JPanel();
	ImageIcon X, O, Header;
	 private JButton playButton = new JButton("Play");
	 private JLabel topLabel = new JLabel("FSU");
	 private JLabel botLabel = new JLabel("Dominique N. Smith");
	 private JButton [][]buttons = new JButton[3][3];
	 public int player1 = 1;
	 public int player2 = 0;
	 public int muplay = 1;
	 public int tie = 1;
	JPanel Signature = new JPanel();

	//main
public static void main(String args[]){
	new TicTacToe().setVisible(true);
}

	//constructor
public TicTacToe() {
	super("TicTacToe");
	setSize(400,400);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	for(int i=0;i<3;i++)
		   for(int j=0;j<3;j++) {
		    buttons[i][j] = new JButton(" ");
		    //buttons[i][j].setBoardValue(i,j,1);
		    buttons[i][j].setBackground(new Color(206, 184, 136));
		    buttons[i][j].setFocusable(false);
		    buttons[i][j].addActionListener(this);
		    centerPanel.add(buttons[i][j]);
		   }
	
	playButton.addActionListener(this);
	JPanel topPanel = new JPanel();
	topPanel.setBackground(new Color(120, 47, 64));
	topPanel.add(topLabel);
	topLabel.setForeground(new Color(206, 184, 136));
	topLabel.setFont(new Font("Courier new", Font.BOLD, 30));

	JPanel   botPanel = new JPanel();
	botPanel.add(botLabel);
	
	setStatus("FSU! Click Play!");
	setButtonsEnabled(false);
	
	botPanel.add(playButton);
	add(topPanel, "North");
	add(centerPanel, "Center");
	add(botPanel, "South");
	
	}
	
	//initial FSU header
	protected JComponent getHeader(){
		JLabel label = new JLabel("FSU", JLabel.CENTER);
		label.setFont(new Font("Courier", Font.BOLD, 24));
		return label;
	}
	
	//enables/disables the x o buttons
	private void setButtonsEnabled(boolean enabled) {
		  for(int i=0;i<3;i++)
		   for(int j=0;j<3;j++) {
		    buttons[i][j].setEnabled(enabled);
		    if(enabled) buttons[i][j].setText(" ");
		   }
		 }
	
	//sets top status bar
	private void setStatus(String s) {
		  topLabel.setText(s);
		 }
	
	//action listener for play button and X O panels
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==playButton)
		{
			play();
		}else {
			for (int i=0; i<3; i++)
				for (int j=0; j<3; j++)
					if(event.getSource()==buttons[i][j])
					{
X=new ImageIcon(this.getClass().getResource("X.png"));
O=new ImageIcon(this.getClass().getResource("O.png"));
if (player1 == 1)
	if (burd[i][j] == 0)
{
		setStatus("UF! GATORS TURN!");
						burd[i][j] = 1;
					    buttons[i][j].setIcon(X);
						setPlayer();
}
if (player2 == 1)
	if (burd[i][j] == 0)
{
		setStatus("FSU! SEMINOLES TURN!");
	burd[i][j] = 2;
    buttons[i][j].setIcon(O);
	setPlayer();
		}
checkwin();
if (tie == 1)
checktie();
					}
		}
	}
	//switches between player 1 and player 2
			private void setPlayer()
			{
			if (player1 == 1)
			{
				player1 = 0;
				player2 = 1;
			}
			else
				if(player2 == 1)
			{
				player2 = 0;
				player1 = 1;
			}
		}
	//long check tie state
			private void checktie()
			{
				for (int i=0; i<3; i++)
					for (int j=0; j<3; j++)
					{
					if (burd[0][0] == 1 || burd[0][0] == 2)
						if (burd[0][1] == 1 || burd[0][1] == 2)
							if (burd[0][2] == 1 || burd[0][2] == 2)
								if (burd[1][0] == 1 || burd[1][0] == 2)
									if (burd[1][1] == 1 || burd[1][1] == 2)
										if (burd[1][2] == 1 || burd[1][2] == 2)
											if (burd[2][0] == 1 || burd[2][0] == 2)
												if (burd[2][1] == 1 || burd[2][1] == 2)
													if (burd[2][2] == 1 || burd[2][2] == 2)
													{
						setStatus("Tie! Please Reset!");
													}
					}
			}
			
	//Stupid long win state checker
	private void checkwin()
	{
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
			{
		//buttons[i][j].checkwinstate(b);
				if (burd[0][2] == 1)
					if (burd[1][1] == 1)
						if (burd[2][0] == 1)
				{
					setStatus("SEMINOLES WIN!");
					setButtonsEnabled(false);
				    playButton.setText("Play");
				    tie = 0;
				}
				if (burd[0][0] == 1)
					if (burd[1][1] == 1)
						if (burd[2][2] == 1)
				{
					setStatus("SEMINOLES WIN!");
					setButtonsEnabled(false);
				    playButton.setText("Play");
				    tie = 0;

				}
		if (burd[0][0] == 1)
			if (burd[0][1] == 1)
				if (burd[0][2] == 1)
		{
			setStatus("SEMINOLES WIN!");
			setButtonsEnabled(false);
		    playButton.setText("Play");
		    tie = 0;

		}//else
			if (burd[1][0] == 1)
				if (burd[1][1] == 1)
					if (burd[1][2] == 1)
			{
				setStatus("SEMINOLES WIN!");
			
				setButtonsEnabled(false);
			    playButton.setText("Play");
			    tie = 0;

			}//else
		if (burd[2][0] == 1)
			if (burd[2][1] == 1)
				if (burd[2][2] == 1)
		{
			setStatus("SEMINOLES WIN!");
			
			setButtonsEnabled(false);
		    playButton.setText("Play");
		    tie = 0;

		}//else
			if (burd[0][0] == 1)
				if (burd[1][0] == 1)
					if (burd[2][0] == 1)
			{
				setStatus("SEMINOLES WIN!");
				
				setButtonsEnabled(false);
			    playButton.setText("Play");
			    tie = 0;

			}//else
					if (burd[0][1] == 1)
						if (burd[1][1] == 1)
							if (burd[2][1] == 1)
					{
						setStatus("SEMINOLES WIN!");
						
						setButtonsEnabled(false);
					    playButton.setText("Play");
					    tie = 0;

					}//else
						if (burd[0][2] == 1)
							if (burd[1][2] == 1)
								if (burd[2][2] == 1)
						{
							setStatus("SEMINOLES WIN!");
							
							setButtonsEnabled(false);
						    playButton.setText("Play");
						    tie = 0;

						}//else
						if (burd[0][2] == 2)
							if (burd[1][1] == 2)
								if (burd[2][0] == 2)
						{
							setStatus("GATORS WIN!");
							setButtonsEnabled(false);
						    playButton.setText("Play");
						    tie = 0;

						}
						if (burd[0][0] == 2)
							if (burd[1][1] == 2)
								if (burd[2][2] == 2)
						{
							setStatus("GATORS WIN!");
							setButtonsEnabled(false);
						    playButton.setText("Play");
						    tie = 0;

						}
						if (burd[0][0] == 2)
							if (burd[1][0] == 2)
								if (burd[2][0] == 2)
						{
							setStatus("GATORS WIN!");
							
							setButtonsEnabled(false);
						    playButton.setText("Play");
						    tie = 0;

						}//else
							if (burd[0][1] == 2)
								if (burd[1][1] == 2)
									if (burd[2][1] == 2)
							{
								setStatus("GATORS WIN!");
							
								setButtonsEnabled(false);
							    playButton.setText("Play");
							    tie = 0;

							}
							if (burd[0][2] == 2)
								if (burd[1][2] == 2)
									if (burd[2][2] == 2)
							{
								setStatus("GATORS WIN!");
								
								setButtonsEnabled(false);
							    playButton.setText("Play");
							    tie = 0;

							}//else
								if (burd[0][0] == 2)
									if (burd[0][1] == 2)
										if (burd[0][2] == 2)
								{
									setStatus("GATORS WIN!");
									
									setButtonsEnabled(false);
								    playButton.setText("Play");
								    tie = 0;

								}//else
									if (burd[1][0] == 2)
										if (burd[1][1] == 2)
											if (burd[1][2] == 2)
									{
										setStatus("GATORS WIN!");
										
										setButtonsEnabled(false);
									    playButton.setText("Play");
									    tie = 0;

									}//else
										if (burd[2][0] == 2)
											if (burd[2][1] == 2)
												if (burd[2][2] == 2)
										{
											setStatus("GATORS WIN!");
											
											setButtonsEnabled(false);
										    playButton.setText("Play");
										    tie = 0;

										}//else
											if (burd[0][2] == 2)
												if (burd[1][2] == 2)
													if (burd[2][2] == 2)
											{
												setStatus("GATORS WIN!");
												
												setButtonsEnabled(false);
											    playButton.setText("Play");
											    tie = 0;

											}
			}
	}

	//Plays music. You can turn it on if you want... May not work.
	
	/*private void PlayMusic() 
	{
		   try {
		          Sequencer sequencer = MidiSystem.getSequencer();
		          if (sequencer == null)
		              throw new MidiUnavailableException();
		          sequencer.open();
		          FileInputStream is = new FileInputStream("C:/Users/Dominique/workspace/Tic Tac Toe/src/Seminolewind.mid");
		          Sequence Seq = MidiSystem.getSequence(is);
		          sequencer.setSequence(Seq);
		          sequencer.start();
		          muplay = 0;
		      } catch (Exception e) {
		          e.printStackTrace();
		      }
		  }*/
	
	//play button reaction to initialize everything
	private void play(){
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++){
		buttons[i][j].setIcon(null);
		burd[i][j] = 0;
			}
		/*if (muplay == 1)
		{
		PlayMusic();
		}*/
		tie = 1;
	    playButton.setText("Reset");
			setStatus("FSU! SEMINOLES TURN!");
			player1 = 1;
			player2 = 0;
			setButtonsEnabled(true);
	}
	
}

		 