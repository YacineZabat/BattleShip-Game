package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import model.Battle;
import view.FieldConfiguration;
import view.Fight;
import view.GameType;

public class FieldConfigurationController implements ActionListener{
	Battle battle;
	FieldConfiguration field;
    ArrayList<Boolean> ships_choices;


	public FieldConfigurationController(Battle battle, FieldConfiguration field, ArrayList<Boolean> ships_choices) {
		this.battle = battle;
		this.field = field;
		this.ships_choices = ships_choices;
	}


	@Override
	// finish the configuration controlling
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.field.getValider_placement())
		{
			 if (battle.getGameMode() == 1)
	         {
	        	 try {
					battle.getPlayer2().createRandomField(this.field.getPlayer().getBattlefield().getShips().keySet());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	             JFrame nextFrame = new Fight(battle,1); 
	             nextFrame.setVisible(true);
	             this.field.dispose();
	         }
	         else
	         {
	        	 if (this.field.getPlayer().getId() == 1 )
	        	 {	 
	             JFrame nextFrame = new FieldConfiguration(battle,this.ships_choices,2); 
	             nextFrame.setVisible(true);
	             this.field.dispose();
	        	 }
	        	 
	        	 if (this.field.getPlayer().getId() == 2)
	        	 {
	                 JFrame nextFrame = new Fight(battle, 1); 
	                 nextFrame.setVisible(true);
	                 this.field.dispose();

	        	 }
	         }
	        
		}
		
		if(e.getSource() == this.field.getjButton1()) // go back
		{
	        JFrame nextFrame = new GameType(battle.getGameMode()); 
	        nextFrame.setVisible(true);
	        this.field.dispose();
		}

		
		
		
		
		
		
		
	}

}
