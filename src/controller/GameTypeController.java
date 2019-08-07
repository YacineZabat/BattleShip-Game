package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Battle;
import model.Player;
import view.GameMode;
import view.GameType;
import view.FieldConfiguration;

public class GameTypeController implements ActionListener{
	
	GameType game;
    Battle battle;
	
	public GameTypeController(GameType game) {
		super();
		this.game = game;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.game.getjButton_precedent_page_type())
		{
		    JFrame previuos = new GameMode(); 
		    this.game.dispose();
		    previuos.setVisible(true);
		}
		
		if(e.getSource() == this.game.getjComboBox1())
		{
			this.game.setBattle_type(this.game.getjComboBox1().getSelectedIndex());
		}
		
		if(e.getSource() == this.game.getjCheckBox_choix1())
		{
		   ArrayList<Boolean> array = this.game.getShip_choices();
		   array.set(0, this.game.getjCheckBox_choix1().isSelected());
			this.game.setShip_choices(array);
		}
		
		if(e.getSource() == this.game.getjCheckBox_choix2())
		{
		   ArrayList<Boolean> array = this.game.getShip_choices();
		   array.set(1, this.game.getjCheckBox_choix2().isSelected());
			this.game.setShip_choices(array);
		}
		
		if(e.getSource() == this.game.getjCheckBox_choix3())
		{
		   ArrayList<Boolean> array = this.game.getShip_choices();
		   array.set(2, this.game.getjCheckBox_choix3().isSelected());
			this.game.setShip_choices(array);
		}
		
		if(e.getSource() == this.game.getjCheckBox_choix4())
		{
		   ArrayList<Boolean> array = this.game.getShip_choices();
		   array.set(3, this.game.getjCheckBox_choix4().isSelected());
			this.game.setShip_choices(array);
		}
		
		if(e.getSource() == this.game.getjCheckBox_choix5())
		{
		   ArrayList<Boolean> array = this.game.getShip_choices();
		   array.set(4, this.game.getjCheckBox_choix5().isSelected());
			this.game.setShip_choices(array);
		}
		
		if (e.getSource() == this.game.getjButton3())
		{
			 boolean isOneSelected = false; 
		        for (Boolean ship_choice : this.game.getShip_choices()) 
		        {
		            if(ship_choice == true)
		            {
		                isOneSelected = true; 
		                break; 
		            }
		        }
		        if(isOneSelected == false)
		        {
		            JOptionPane.showMessageDialog(null, "Choisir navires");
		        }
		        else
		        {
		            battle = new Battle(this.game.getBattle_mode(), this.game.getBattle_type(), new Player(1), new Player(2));
		            JFrame nextFrame1 = new FieldConfiguration(battle, this.game.getShip_choices(),1); 
		            nextFrame1.setVisible(true);
		            this.game.dispose();
		        }
		
		
		
		
		
	}

}
	
}
