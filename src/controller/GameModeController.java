package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.Demo;
import view.GameMode;
import view.GameType;

public class GameModeController implements ActionListener {

	GameMode g;
	
	public GameModeController(GameMode g) {
		this.g = g;
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == g.getjButton_demo())
				{
	        // Mode démo:
	        this.g.setBattle_mode(0); 
	        JFrame nextFrame = new Demo(); 
	        nextFrame.setVisible(true);
	        this.g.dispose();
				}
		
		if (e.getSource() == g.getjButton_1jouer())
		{
	        this.g.setBattle_mode(1); 
	        JFrame nextFrame = new GameType(1); 
	        nextFrame.setVisible(true);
	        this.g.dispose();
			
		}
		
		if (e.getSource() == g.getjButton_2jouers())
		{
	        this.g.setBattle_mode(1); 
	        JFrame nextFrame = new GameType(2); 
	        nextFrame.setVisible(true);
	        this.g.dispose();
			
		}
	}

}
