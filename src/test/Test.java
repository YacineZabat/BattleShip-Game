package test;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import model.Battle;
import model.Coordinates;
import model.Player;
import model.Position;
import model.Ship;
import model.ShipType;

public class Test {

  public static void main(String[] args) {
	
	/*  menu m = new menu();
	  
	  java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              new menu().setVisible(true);
          }
      });*/
	  

	  try {
	

	/*	  Ship ac = new Ship(ShipType.AircraftCarrier);
		  Ship ns = new Ship(ShipType.NuclearSubmarine);
		  Ship ic = new Ship(ShipType.Ironclad);
		  Ship z = new Ship(ShipType.Zodiac); 
		  
		  Player player1 = new Player(1, 2);
		 System.out.println( player1.placeShip(ac, new Position(new Coordinates(0, 0), new Coordinates(4, 0))));
	     System.out.println(player1.getBattlefield().SafeArea());   
	     Player player2 = new Player(2, 2);
		 System.out.println( player2.placeShip(ac, new Position(new Coordinates(0, 9), new Coordinates(4, 9))));
	     System.out.println(player2.getBattlefield().SafeArea());   
	     AbstractBattle battle = new AbstractBattle(0, 0, player1, player2);
	     battle.launchGame(); */
	     
	     
		// System.out.println(player1.placeShip(ns, new Position(new Coordinates(7, 0), new Coordinates(7, 3)))); 
	//	 System.out.println(player1.placeShip(ic, new Position(new Coordinates(9, 7), new Coordinates(9, 9)))); 
		// System.out.println(player1.placeShip(ic, new Position(new Coordinates(1, 6), new Coordinates(3, 6)))); 
		// System.out.println(player1.placeShip(z, new Position(new Coordinates(5, 7), new Coordinates(6, 7)))); 
	
	   //  System.out.println(player1.getBattlefield().getShips().get(z));
	
		// System.out.println(player2.placeShip(ns, new Position(new Coordinates(7, 0), new Coordinates(7, 3)))); 
		// System.out.println(player2.placeShip(ic, new Position(new Coordinates(9, 7), new Coordinates(9, 9)))); 
		// System.out.println(player1.placeShip(ic, new Position(new Coordinates(1, 6), new Coordinates(3, 6)))); 
		// System.out.println(player1.placeShip(z, new Position(new Coordinates(5, 7), new Coordinates(6, 7)))); 
	  //   System.out.println(player2.getBattlefield().getShips().get(z));
	     
	/*   System.out.println(player1.shoot(player2, new Coordinates(0, 0)));
	   System.out.println(player2.getBattlefield().getShots());
	   System.out.println(player2.getBattlefield().SafeArea());
	   for (Ship s : player2.getBattlefield().getShips().keySet())
	   {
		   System.out.println(s.getState());
	   } */
	   
	/*   System.out.println(player1.shoot(player2, new Coordinates(0, 3))); // distance
       System.out.println(player2.getBattlefield().getShots());
	   System.out.println(player1.shoot(player2, new Coordinates(1, 0)));
	   System.out.println(player1.shoot(player2, new Coordinates(2, 0)));
	   System.out.println(player1.shoot(player2, new Coordinates(3, 0)));
	   System.out.println(player1.shoot(player2, new Coordinates(4, 0)));
	   System.out.println(player1.shoot(player2, new Coordinates(0, 4))); // distance */

	   
	  // System.out.println(player2.getBattlefield().SafeArea());
		  
		  Coordinates a = new Coordinates(3, 5);
		  Coordinates b= new Coordinates(2, 5);
		  Coordinates c = new Coordinates(4, 5);
		  Coordinates d = new Coordinates(5, 5);
		  Coordinates E = new Coordinates(6, 5);
		  ArrayList<Coordinates> array = new ArrayList<>();
		  array.add(a);
		  array.add(b);
		  array.add(c);
		  array.add(d);
		  array.add(E);
		  System.out.println(Coordinates.isAllHorizontal(array));
		  System.out.println(array);
		  System.out.println(Coordinates.getSort(array));
	      System.out.println( Coordinates.isContiguous(array));
	      System.out.println(Coordinates.getPositionOfCoordinates(array));
	     



		  
		  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 
}
	
	
}
