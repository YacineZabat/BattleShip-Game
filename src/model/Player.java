package model;

import java.util.Set;

public class Player {
	private Field battlefield;
	private int id;


	public Player(int id)
	{
		this.id = id;
		this.battlefield = new Field();
	}

	public int shoot(Player player, Coordinates shot) throws Exception
	{
		return (player.recieveShot(shot));
	}

	public int recieveShot(Coordinates shot) throws Exception
	{
		return(battlefield.addShot(shot));
	}

	public boolean placeShip(Ship ship, Position position) throws Exception
	{
		return battlefield.addShip(ship,position);
	}

	public boolean isLoser()
	{
		return battlefield.isDestroyed();
	}

	public int getId(){ return this.id; }

	public Field getBattlefield() {
		return battlefield;
	}

	public void createRandomField(Set<Ship> myShips) throws Exception
	{
		for (Ship s : myShips)
		{
			int size = s.getType().getSize();
			Ship newShip = new Ship(s.getType());
			Position p = Position.getRandomPosition(size);
			while(!(placeShip(newShip, p)))
			{
		      p = Position.getRandomPosition(size);
			}
		}
		
	}
	
	

}
