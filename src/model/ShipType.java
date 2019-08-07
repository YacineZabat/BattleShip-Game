package model;

public enum ShipType
{
	AircraftCarrier(5),
	NuclearSubmarine(4),
	Ironclad(3),
	Zodiac(2);
	private int size;

	ShipType(int size)
	{
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}