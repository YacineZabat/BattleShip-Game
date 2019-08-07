package controller;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Battle;
import model.Coordinates;
import view.Fight;
import view.Principale;

public class PcFightController implements ActionListener {
	
	Fight game;
	Battle battle;
	

	public PcFightController(Fight game, Battle battle) {
		this.game = game;
		this.battle = battle;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton[][] field = this.game.getEnnemy_field();
		try {
		} catch (HeadlessException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		for (int i =0; i< 10; i++)
		{
			for (int j = 0; j<10; j++)
			{
				if (e.getSource() == field[i][j] && (field[i][j].getBackground() != Color.RED) && (field[i][j].getBackground() != Color.blue)) 
				{
					try 
					{
						int shot =this.battle.player1Play(new Coordinates(i, j));
						if(shot == 0)
						{
							field[i][j].setBackground(Color.red);
			

						}
						
						else 
						{
							field[i][j].setBackground(Color.BLUE);
							if (this.battle.getBattleType() == 2)
							{
								JOptionPane.showMessageDialog(null, "you are " + shot+"steps closer");
							}
							

						}
						
						if(this.battle.getPlayer2().isLoser() )
						{
							 JOptionPane.showMessageDialog(null, "You won, the pc lost, Congrats!");
							 Principale p = new Principale();
							 p.setVisible(true);
							 this.game.dispose();
							 return;
						}
						// pc shooting
						
						Coordinates pcShot = Coordinates.getRandomCoordinate();
						int result = 0;
						while((result =battle.player2Play(pcShot ))== -1)
						{
							pcShot = Coordinates.getRandomCoordinate();
						}
					
						if (result!=0)
						{
						this.game.getMy_field()[pcShot.getI()][pcShot.getJ()].setBackground(Color.BLUE);
						}
						
						else
						{
							this.game.getMy_field()[pcShot.getI()][pcShot.getJ()].setBackground(Color.red);
	
						}
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					
					
				}
			}
		}
		
	}

}
