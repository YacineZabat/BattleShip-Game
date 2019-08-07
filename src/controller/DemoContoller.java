package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.Demo;
import view.GameMode;

public class DemoContoller implements ActionListener {
	private Demo demo; 
	private static int step = 0; 
	
	public DemoContoller(Demo demo) {
		this.demo = demo; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == demo.getButtonSuivant()){
	        
			if(step == 0)
				demo.get_field1()[2][2].setBackground(Color.blue); 
			if(step == 1)
				demo.get_field2()[3][5].setBackground(Color.blue);
			if(step == 2)
				demo.get_field1()[4][6].setBackground(Color.blue); 
			if(step == 3)
				demo.get_field2()[8][3].setBackground(Color.red);
			if(step == 4)
				demo.get_field1()[8][8].setBackground(Color.blue); 
			if(step == 5)
				demo.get_field2()[8][4].setBackground(Color.red);
			if(step == 6)
				demo.get_field1()[5][2].setBackground(Color.red); 
			if(step == 7)
				demo.get_field2()[8][5].setBackground(Color.blue);
			if(step == 8)
				demo.get_field1()[5][1].setBackground(Color.blue); 
			if(step == 9)
				demo.get_field2()[8][2].setBackground(Color.red);
			
			if(step == 10)
				demo.get_field1()[6][8].setBackground(Color.blue); 
			if(step == 11)
				demo.get_field2()[8][1].setBackground(Color.blue);
			
			if(step == 12)
				demo.get_field1()[5][3].setBackground(Color.red); 
			if(step == 13)
				demo.get_field2()[2][7].setBackground(Color.red);
			if(step == 14)
				demo.get_field1()[5][4].setBackground(Color.blue); 
			if(step == 15){
				demo.get_field2()[2][8].setBackground(Color.red);
				JOptionPane.showMessageDialog(null, "Player 1 Won the game"); 
				JFrame frame = new GameMode(); 
	            frame.setVisible(true);
	            demo.dispose();
			}
			step++; 
		
		}
		
		
		new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		            	if(step <16)
		            		demo.getButtonSuivant().doClick(); 
		            }
		        }, 
		        300*step 
		);
		
		
		
		
	}
	
	
	
}
