package controller;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.Battle;
import model.Coordinates;
import model.Player;
import view.Fight;
import view.Principale;
import view.SwitchPlayer;

public class MultiPlayerFightController implements ActionListener {
	
	Fight game;
	Battle battle;
	Player playerPlay, playerWait; 
	Coordinates coordinatesByInterface = null; 
	

	public MultiPlayerFightController(Fight game, Battle battle, int token) {
		this.game = game;
		this.battle = battle;
		if(token == 1){
			playerPlay = battle.getPlayer1(); 
			playerWait = battle.getPlayer2(); 
		}
		else{
			playerPlay = battle.getPlayer2(); 
			playerWait = battle.getPlayer1(); 
		}
	}
	/*
	public MultiPlayerFightController(Fight game, Battle battle, int token, Coordinates coordinatesByInterface ){
		this(game, battle, token); 
		this.coordinatesByInterface = coordinatesByInterface; 
		
	}
	 */
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton[][] field = this.game.getEnnemy_field();
	
		
		for (int i =0; i< 10; i++)
		{
			for (int j = 0; j<10; j++)
			{
				if (e.getSource() == field[i][j] && (field[i][j].getBackground() != Color.RED) && (field[i][j].getBackground() != Color.blue)) 
				{
					try 
					{
						int shot = playerPlay.shoot(playerWait, new Coordinates(i, j));
						if(shot == 0)
						{
							field[i][j].setBackground(Color.red);
						}
						
						else 
						{
							field[i][j].setBackground(Color.BLUE);
							if (this.battle.getBattleType() == 1)
							{
								JOptionPane.showMessageDialog(null, "you are " + shot+"steps closer");
							}

						}
						
						if(playerWait.isLoser() )
						{
							JOptionPane.showMessageDialog(null, "You won, Congrats!");
							 Principale p = new Principale();
							 p.setVisible(true);
							 this.game.dispose();
							 return;
						}
	 
						JOptionPane optionPane = new JOptionPane("Its your friend turn",
						        JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, null,
						        "Please ENTER your NAME here");
						    JDialog dialog = optionPane.createDialog(null, "");
						    dialog.setLocation(490 , 300);
						    dialog.setVisible(true);
						    System.out.println(optionPane.getInputValue());
						
						SwitchPlayer switchPage = new SwitchPlayer(battle, playerWait.getId()); 
						switchPage.setVisible(true); 
						this.game.dispose(); 
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
			}
		}
		
	}


}
