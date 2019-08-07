package model;

import java.util.ArrayList;

public class Ship {
	private ShipType type;
	private ArrayList<Boolean> state;

	public Ship(ShipType type)
	{
		this.type = type;
		this.state = new ArrayList<>();
		int i=0;
		while(  i < type.getSize())
		{
			state.add(true);
			i++;
		}
	}

	public void updateState(int index)
	{
		state.set(index,false);
	}
		

	public ShipType getType() {
		return type;
	}

	public ArrayList<Boolean> getState() {
		return state;
	}
	public boolean isDestroyed()
	{
		for (Boolean stat : state)
			if (stat)
				return false;
		return true;
	}
}
