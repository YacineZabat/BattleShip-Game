package model;


import java.util.*;

public class Field {
	private Map<Ship,Position> ships;
	private Set<Coordinates> shots;

	// Constructor
	public Field()
	{
		shots = new LinkedHashSet<>();
		ships = new LinkedHashMap<>();
	}

	public int addShot(Coordinates shot) throws Exception
	{
		if (shots.add(shot))
		{
			Ship ship = getShotShip(shot);
			if(ship != null)
			{
				int damagedPart = getDamage(ship,shot);
				ship.updateState(damagedPart);
				return 0;
			}
			return getNearestShipDistance(shot);
		}
		return -1;
	}

	public boolean addShip(Ship ship,Position position) throws Exception
	{
		for (Coordinates c : position.getArea())
		{
			if(getArea().contains(c) || getShipsBorders().contains(c))
				return false;
		}
		
		ships.put(ship,position);
		return true;
	}

	private boolean shotIsOnTheShipHoziontal(Position position, Coordinates shot)
	{
		if (( shot.getI() == position.getStart().getI())
						  && shot.getI() == position.getEnd().getI()
		                  && shot.getJ() >= position.getStart().getJ()
				          && shot.getJ() <= position.getEnd().getJ()
						)
			{
			return true;
			}
		return false;
	}

	private  boolean shotIsOnTheShipVertical(Position position, Coordinates shot)
	{
		if(shot.getJ() == position.getStart().getJ()
				&& shot.getJ() == position.getEnd().getJ() &&
				shot.getI() >= position.getStart().getI()
				&& shot.getI() <= position.getEnd().getI() )
			{
			return true;
			}
		return false;
	}
	public Ship getShotShip(Coordinates shot)
	{
		for(Ship ship : ships.keySet())
		{
			Position position = ships.get(ship);
			if(shotIsOnTheShipHoziontal(position,shot) ||
				shotIsOnTheShipVertical(position,shot))
				return ship;
		}
		return null;
	}

	public int getDamage(Ship ship, Coordinates shot)
	{
		Position position = ships.get(ship);
		int damagedPart = 0;
		if(shotIsOnTheShipHoziontal(position,shot))
			damagedPart = shot.getJ() - position.getStart().getJ();
		else if (shotIsOnTheShipVertical(position, shot))
			return damagedPart = shot.getI() - position.getStart().getI();
		return damagedPart;
	}

	//DOCS
	public boolean isDestroyed()
	{
		for (Ship ship : ships.keySet())
			if(!ship.isDestroyed())
				return false;
		return true;
	}
	
	public int getNearestShipDistance (Coordinates c) throws Exception
	{
		int min = 200;
		
		for (Coordinates coord : getSafeArea())
		{
			int i = Math.abs(c.getI() - coord.getI());
			int j = Math.abs(c.getJ() - coord.getJ());
			
			if  ((i+j) < min)
				min = (i+j);
		}
	
		return min;
	}
	
	public Set<Coordinates> getSafeArea() throws Exception
	{
		Set<Coordinates> sp = getArea();
		sp.removeAll(this.shots);
		return sp;
	}
	
	public Set<Coordinates>getArea() throws Exception {
		
		
		Set<Coordinates> sp = new LinkedHashSet<>();
		
		for(Ship ship : ships.keySet())
		{
			Position position = ships.get(ship);
			sp.addAll(position.getArea());

		}
		
		return sp;
	}

	public Map<Ship, Position> getShips() {
		return ships;
	}

	public Set<Coordinates> getShots() {
		return shots;
	}
	
	public Set<Coordinates>  getShipsBorders()
	{
		Set<Coordinates> borders = new TreeSet<>();
		for(Ship ship : ships.keySet())
		{
			Position position = ships.get(ship);

			borders.addAll(position.getBorders());
		}
		
		return borders;	
	}
	
	
	
	
	
	

	
}
