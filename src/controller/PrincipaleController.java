package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.GameMode;
import view.Principale;

public class PrincipaleController  implements ActionListener{
	
	Principale p ;
	
	

	public PrincipaleController(Principale p) {
		this.p = p;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == p.getjButton1())
		{
	        JFrame nextFrame = new GameMode(); 
	        nextFrame.setVisible(true);
	        this.p.dispose();
		}
		
	}

}
